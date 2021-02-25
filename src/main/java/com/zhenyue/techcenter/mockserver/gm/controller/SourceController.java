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
@RequestMapping("local/source")
public class SourceController {


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
     *  查询测试接口
     * @param params
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public JSON list(@RequestBody String params) {

        // 添加小黄蜂
        JSONObject info1 = new JSONObject();
        JSONObject propInfo1 = new JSONObject();
        propInfo1.put("prop", "1001");
        propInfo1.put("num", 1);

        JSONObject propInfo2 = new JSONObject();
        propInfo2.put("prop", "1002");
        propInfo2.put("num", 1);

        JSONArray propArray = new JSONArray();
        propArray.add(propInfo1);
        propArray.add(propInfo2);


//        info1.put("data", propArray);
        info1.put("uid", "1001");
        info1.put("prop_1", "1");
        info1.put("num_1", 1);

        JSONArray dataArray = new JSONArray();
        dataArray.add(info1);

        ResponseModel responseModel = new ResponseModel();
        responseModel.setRet(0);
        responseModel.setData(dataArray);
        return (JSON) JSON.toJSON(responseModel);
    }

}
