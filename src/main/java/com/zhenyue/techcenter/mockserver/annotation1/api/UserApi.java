package com.zhenyue.techcenter.mockserver.annotation1.api;

import com.zhenyue.techcenter.mockserver.annotation1.CmdTag;
import com.zhenyue.techcenter.mockserver.annotation1.OperateHandleService;
import com.zhenyue.techcenter.mockserver.annotation1.model.OperateRequest;
import com.zhenyue.techcenter.mockserver.annotation1.model.OperateResponse;
import org.springframework.stereotype.Service;

@Service("UserApi")
@CmdTag("user")
public class UserApi implements OperateHandleService {

    @Override
    public OperateResponse operate(OperateRequest request) {
        OperateResponse response = new OperateResponse();
        response.setCode(1001);
        response.setMessage("用户操作");
        return response;
    }

    public OperateResponse login(OperateRequest request) {
        OperateResponse response = new OperateResponse();
        response.setCode(1002);
        response.setMessage("用户-login");
        return response;
    }
}
