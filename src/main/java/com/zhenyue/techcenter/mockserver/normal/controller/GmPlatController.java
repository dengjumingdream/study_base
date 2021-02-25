package com.zhenyue.techcenter.mockserver.normal.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zhenyue.techcenter.mockserver.gm.model.ResponseModel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gmPlat/SensitiveWords")
public class GmPlatController {

    /**
     *   查询
     * @param params
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public JSON list(@RequestBody String params) {

        JSONObject info1 = new JSONObject();
        info1.put("id", "1001");
        info1.put("keyword", "小芳");

        JSONObject info2 = new JSONObject();
        info2.put("id", "1002");
        info2.put("keyword", "索菲亚");

        JSONObject info3 = new JSONObject();
        info3.put("id", "1003");
        info3.put("keyword", "娜塔莎");

        JSONObject info4 = new JSONObject();
        info4.put("id", "1004");
        info4.put("keyword", "安吉");

        JSONObject info5 = new JSONObject();
        info5.put("id", "1005");
        info5.put("keyword", "伊莲");

        JSONArray dataArray = new JSONArray();
        dataArray.add(info1);
        dataArray.add(info2);
        dataArray.add(info3);
        dataArray.add(info4);
        dataArray.add(info5);

        ResponseModel responseModel = new ResponseModel();
        responseModel.setRet(0);
        responseModel.setData(dataArray);
        return (JSON) JSON.toJSON(responseModel);
    }
}
