package com.zhenyue.techcenter.mockserver.selftest.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zhenyue.techcenter.mockserver.model.ResponseModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("test")
public class DingdingController {

    /**
     *   查询
     * @param
     * @return
     */
    @CrossOrigin
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(String code, String state) {
        System.out.println("code:" +  code);
        System.out.println("state:" + state);
        return "hello,wold";
    }
}
