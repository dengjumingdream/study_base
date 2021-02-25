package com.zhenyue.techcenter.mockserver.annotation.impl;

import com.zhenyue.techcenter.mockserver.annotation.OrderNotifyHandleService;
import com.zhenyue.techcenter.mockserver.annotation.RequestTag;
import com.zhenyue.techcenter.mockserver.annotation.model.VendorOrderNotifyResponse;
import org.springframework.stereotype.Service;

@Service("NonSupportNotifyHandleServiceImpl")
@RequestTag("non")
public class NonSupportNotifyHandleServiceImpl implements OrderNotifyHandleService {
    @Override
    public VendorOrderNotifyResponse orderNotify(String data) {
        return null;
    }
}
