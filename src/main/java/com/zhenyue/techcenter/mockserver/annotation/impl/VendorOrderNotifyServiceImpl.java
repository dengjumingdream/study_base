package com.zhenyue.techcenter.mockserver.annotation.impl;

import com.zhenyue.techcenter.mockserver.annotation.OrderNotifyContextService;
import com.zhenyue.techcenter.mockserver.annotation.OrderNotifyHandleService;
import com.zhenyue.techcenter.mockserver.annotation.VendorOrderNotifyService;
import com.zhenyue.techcenter.mockserver.annotation.model.VendorOrderNotifyRequest;
import com.zhenyue.techcenter.mockserver.annotation.model.VendorOrderNotifyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Optional;

@Service
public class VendorOrderNotifyServiceImpl implements VendorOrderNotifyService {

    /**
     * 持有上下文
     */
    @Autowired
    private OrderNotifyContextService contextService;

    @Override
    public VendorOrderNotifyResponse orderNotify(VendorOrderNotifyRequest request) {
        String tag = Optional.ofNullable(request).map(VendorOrderNotifyRequest::getTag).orElse("");
        String[] s = tag.split(".");
        OrderNotifyHandleService handleService = contextService.getContext(s[0]);
        VendorOrderNotifyResponse response = new VendorOrderNotifyResponse();
        try {
            Class clazz = handleService.getClass();
            Method _method = clazz.getMethod(s[1]);
            response = (VendorOrderNotifyResponse) _method.invoke(request.getData());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return response;
    }

}
