package com.zhenyue.techcenter.mockserver.annotation1.impl;

import com.zhenyue.techcenter.mockserver.annotation1.CmdTag;
import com.zhenyue.techcenter.mockserver.annotation1.OperateHandleService;
import com.zhenyue.techcenter.mockserver.annotation1.model.OperateRequest;
import com.zhenyue.techcenter.mockserver.annotation1.model.OperateResponse;
import org.springframework.stereotype.Service;

@Service("NonOperateServiceImpl")
@CmdTag("Non")
public class NonOperateServiceImpl implements OperateHandleService {

    @Override
    public OperateResponse operate(OperateRequest request) {
        return null;
    }
}
