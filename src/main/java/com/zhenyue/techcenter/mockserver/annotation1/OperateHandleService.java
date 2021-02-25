package com.zhenyue.techcenter.mockserver.annotation1;

import com.zhenyue.techcenter.mockserver.annotation1.model.OperateRequest;
import com.zhenyue.techcenter.mockserver.annotation1.model.OperateResponse;

public interface OperateHandleService {
    OperateResponse operate(OperateRequest request);
}
