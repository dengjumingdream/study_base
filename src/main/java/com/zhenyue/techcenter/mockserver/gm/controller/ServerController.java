package com.zhenyue.techcenter.mockserver.gm.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gmservice/service")
public class ServerController {

    /**
     * 服务器列表
     * @param params
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public JSONObject list(@RequestBody JSONObject params) {


        JSONObject info1 = new JSONObject();
        info1.put("id", "1服");
        info1.put("name", "1服");

        JSONObject info2 = new JSONObject();
        info2.put("id", "2服");
        info2.put("name", "2服");

        JSONObject info3 = new JSONObject();
        info3.put("id", "3服");
        info3.put("name", "3服");

        JSONArray data = new JSONArray();
        data.add(info1);
        data.add(info2);
        data.add(info3);

        JSONObject result = new JSONObject();
        result.put("ret", 0);
        result.put("data", data);

        return result;
    }
}
