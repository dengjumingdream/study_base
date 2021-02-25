package com.zhenyue.techcenter.mockserver.annotation;

import com.zhenyue.techcenter.mockserver.annotation.model.VendorOrderNotifyRequest;
import com.zhenyue.techcenter.mockserver.annotation.model.VendorOrderNotifyResponse;

public interface VendorOrderNotifyService {
    VendorOrderNotifyResponse orderNotify(VendorOrderNotifyRequest request);
}
