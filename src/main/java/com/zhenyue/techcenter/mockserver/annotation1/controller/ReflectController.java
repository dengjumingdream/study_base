package com.zhenyue.techcenter.mockserver.annotation1.controller;

import com.zhenyue.techcenter.mockserver.annotation1.VenderOperateService;
import com.zhenyue.techcenter.mockserver.annotation1.model.OperateRequest;
import com.zhenyue.techcenter.mockserver.annotation1.model.OperateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("reflect")
public class ReflectController {

    @Autowired
    private VenderOperateService operateService;

    /**
     *   查询
     * @param
     * @return
     */
    @CrossOrigin
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(@RequestParam("cmd") String cmd) {
        // 模拟设置 cmd
        OperateRequest request = new OperateRequest();
        request.setCmd(cmd);

        // 传入request
        OperateResponse response = operateService.vender(request);

        // 返回对应消息
        String msg = response.getMessage();
        return msg;
    }
}
