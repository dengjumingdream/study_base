package com.zhenyue.techcenter.mockserver.annotation1.api;

import com.zhenyue.techcenter.mockserver.annotation1.CmdTag;
import com.zhenyue.techcenter.mockserver.annotation1.OperateHandleService;
import com.zhenyue.techcenter.mockserver.annotation1.model.OperateRequest;
import com.zhenyue.techcenter.mockserver.annotation1.model.OperateResponse;
import org.springframework.stereotype.Service;

@Service("PlayerApi")
@CmdTag("player")
public class PlayerApi implements OperateHandleService {

    @Override
    public OperateResponse operate(OperateRequest request) {
        OperateResponse response = new OperateResponse();
        response.setCode(1003);
        response.setMessage("玩家操作");
        return response;
    }

    public OperateResponse rename(OperateRequest request) {
        OperateResponse response = new OperateResponse();
        response.setCode(1004);
        response.setMessage("玩家-rename");
        return response;
    }

}
