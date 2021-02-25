package com.zhenyue.techcenter.mockserver.spring.annotation;

import com.zhenyue.techcenter.mockserver.spring.annotation.model.VendorOrderNotifyResponse;

public interface OrderNotifyHandleService {

    VendorOrderNotifyResponse orderNotify(String data);
}
