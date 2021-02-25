package com.zhenyue.techcenter.mockserver.gm.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.xiaoymin.knife4j.annotations.ApiSort;
import com.zhenyue.techcenter.mockserver.gm.model.ResponseModel;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "2.0.2版本-20200226")
@ApiSort(0)
@RestController
@RequestMapping("/local/scarceSource")
public class ScarceSourceController {

    /**
     *   编辑
     * @param params
     * @return
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public JSON list(@RequestBody String params) {
       JSONArray dataArray = new JSONArray();
        ResponseModel responseModel = new ResponseModel();
        responseModel.setRet(0);
        responseModel.setData(dataArray);
        return (JSON) JSON.toJSON(responseModel);
    }

    /**
     *   新增
     * @param params
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public JSON prop(@RequestBody String params) {
        JSONObject info = new JSONObject();
        JSONArray dataArray = new JSONArray();
        dataArray.add(info);
        ResponseModel responseModel = new ResponseModel();
        responseModel.setRet(0);
        responseModel.setData(dataArray);
        return (JSON) JSON.toJSON(responseModel);
    }
}
