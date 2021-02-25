package com.zhenyue.techcenter.mockserver.annotation1.impl;

import com.zhenyue.techcenter.mockserver.annotation.VendorOrderNotifyService;
import com.zhenyue.techcenter.mockserver.annotation.model.VendorOrderNotifyRequest;
import com.zhenyue.techcenter.mockserver.annotation.model.VendorOrderNotifyResponse;
import com.zhenyue.techcenter.mockserver.annotation1.OperateContextService;
import com.zhenyue.techcenter.mockserver.annotation1.OperateHandleService;
import com.zhenyue.techcenter.mockserver.annotation1.VenderOperateService;
import com.zhenyue.techcenter.mockserver.annotation1.model.OperateRequest;
import com.zhenyue.techcenter.mockserver.annotation1.model.OperateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


@Service
public class VenderOperateServiceImpl implements VenderOperateService {

    @Autowired
    private OperateContextService service;

    @Override
    public OperateResponse vender(OperateRequest request) {
        String cmd = request.getCmd();
        String[] s = cmd.split("\\.");
        OperateHandleService handleService = service.getContext(s[0]);
        OperateResponse response = new OperateResponse();
        try {
            Class clazz = handleService.getClass();
            Method method = clazz.getMethod(s[1], OperateRequest.class);
            response = (OperateResponse) method.invoke(clazz.newInstance(), request);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return response;
    }
}
