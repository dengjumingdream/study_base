package com.zhenyue.techcenter.mockserver.spring.annotation;

import com.zhenyue.techcenter.mockserver.spring.annotation.model.VendorOrderNotifyRequest;
import com.zhenyue.techcenter.mockserver.spring.annotation.model.VendorOrderNotifyResponse;

public interface VendorOrderNotifyService {
    VendorOrderNotifyResponse orderNotify(VendorOrderNotifyRequest request);
}
