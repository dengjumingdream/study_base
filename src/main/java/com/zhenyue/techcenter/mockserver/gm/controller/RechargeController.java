package com.zhenyue.techcenter.mockserver.gm.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zhenyue.techcenter.mockserver.gm.model.ResponseModel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("local/recharge")
public class RechargeController {


    /**
     *  新增测试接口
     * @param params
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public JSON add(@RequestBody String params) {

        JSONArray dataArray = new JSONArray();
        JSONObject info1 = new JSONObject();
        info1.put("", "");
        info1.put("", "");
        info1.put("", "");

        ResponseModel responseModel = new ResponseModel();
        responseModel.setRet(0);
        responseModel.setData(dataArray);
        return (JSON) JSON.toJSON(responseModel);
    }

    /**
     *  编辑测试接口
     * @param params
     * @return
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public JSON edit(@RequestBody String params) {

        JSONArray dataArray = new JSONArray();
        JSONObject info1 = new JSONObject();
        info1.put("", "");
        info1.put("", "");
        info1.put("", "");

        ResponseModel responseModel = new ResponseModel();
        responseModel.setRet(0);
        responseModel.setData(dataArray);
        return (JSON) JSON.toJSON(responseModel);
    }

    /**
     *  查询测试接口
     * @param params
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public JSON list(@RequestBody String params) {

        JSONObject info1 = new JSONObject();

        info1.put("uid", "1001");
        info1.put("gold", 1);
        info1.put("vip1", 5);
        info1.put("vip2", 3);

        JSONArray dataArray = new JSONArray();
        dataArray.add(info1);

        ResponseModel responseModel = new ResponseModel();
        responseModel.setRet(0);
        responseModel.setData(dataArray);
        return (JSON) JSON.toJSON(responseModel);
    }

}
