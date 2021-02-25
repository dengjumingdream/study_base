package com.zhenyue.techcenter.mockserver.warcellstest.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zhenyue.techcenter.mockserver.model.ResponseModel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("warCells/activities/modelKey")
public class ModelKeyController {

    public static JSONObject info = new JSONObject();

    /**
     *   道具
     * @param
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String list() {
        JSONObject info1 = new JSONObject();
        info1.put("modelKey", "MONDAY");
        info1.put("name", "周一（默认)");

        JSONObject info2 = new JSONObject();
        info2.put("modelKey", "TUESDAY");
        info2.put("name", "周二（默认)");

        JSONObject info3 = new JSONObject();
        info3.put("modelKey", "WEDNESDAY");
        info3.put("name", "周三（默认)");

        JSONObject info4 = new JSONObject();
        info4.put("modelKey", "THURSDAY");
        info4.put("name", "周四（默认)");

        JSONObject info5 = new JSONObject();
        info5.put("modelKey", "FRIDAY");
        info5.put("name", "周五（默认)");

        JSONObject info6 = new JSONObject();
        info6.put("modelKey", "SATURDAY");
        info6.put("name", "周六（默认)");

        JSONObject info7 = new JSONObject();
        info7.put("modelKey", "1611024999");
        info7.put("name", "activity_roulette_1");

        JSONObject info8 = new JSONObject();
        info8.put("modelKey", "1611025150");
        info8.put("name", "activity_roulette_1");

        JSONArray data = new JSONArray();
        data.add(info1);
        data.add(info2);
        data.add(info3);
        data.add(info4);
        data.add(info5);
        data.add(info6);
        data.add(info7);
        data.add(info8);
        ResponseModel responseModel = new ResponseModel();
        responseModel.setRet(0);
        responseModel.setData(data);
        return responseModel.toString();
    }

    /**
     *   新增
     * @param params
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@RequestBody String params) {
        ResponseModel responseModel = new ResponseModel();
        responseModel.setRet(0);
        return responseModel.toString();
    }

    /**
     *   编辑
     * @param params
     * @return
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String edit(@RequestBody String params) {
        ResponseModel responseModel = new ResponseModel();
        responseModel.setRet(0);
        return responseModel.toString();
    }
}
