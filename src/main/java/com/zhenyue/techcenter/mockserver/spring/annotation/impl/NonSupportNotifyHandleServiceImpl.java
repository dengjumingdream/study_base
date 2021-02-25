package com.zhenyue.techcenter.mockserver.spring.annotation.impl;

import com.zhenyue.techcenter.mockserver.spring.annotation.OrderNotifyHandleService;
import com.zhenyue.techcenter.mockserver.spring.annotation.RequestTag;
import com.zhenyue.techcenter.mockserver.spring.annotation.model.VendorOrderNotifyResponse;
import org.springframework.stereotype.Service;

@Service("NonSupportNotifyHandleServiceImpl")
@RequestTag("non")
public class NonSupportNotifyHandleServiceImpl implements OrderNotifyHandleService {
    @Override
    public VendorOrderNotifyResponse orderNotify(String data) {
        return null;
    }
}
