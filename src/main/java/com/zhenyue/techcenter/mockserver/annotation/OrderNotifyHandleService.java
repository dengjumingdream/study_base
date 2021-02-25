package com.zhenyue.techcenter.mockserver.annotation;

import com.zhenyue.techcenter.mockserver.annotation.model.VendorOrderNotifyResponse;

public interface OrderNotifyHandleService {

    VendorOrderNotifyResponse orderNotify(String data);
}
