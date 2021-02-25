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
@RequestMapping("/local/scarce")
public class ScarceController {

    /**
     *   查询
     * @param params
     * @return
     */
    @RequestMapping(value = "/info", method = RequestMethod.POST)
    public JSON list(@RequestBody String params) {
        JSONObject info = new JSONObject();
        info.put("value", "1");
        info.put("price", "1000");
        info.put("label", "士兵_1级步兵");

        JSONObject info1 = new JSONObject();
        info1.put("value", "2");
        info1.put("price", "2000");
        info1.put("label", "士兵_1级炮兵");

        JSONObject info2 = new JSONObject();
        info2.put("value", "3");
        info2.put("price", "3000");
        info2.put("label", "士兵_1级骑兵");

        JSONObject info3 = new JSONObject();
        info3.put("value", "4");
        info3.put("price", "4000");
        info3.put("label", "士兵_2级步兵");

        JSONObject info4 = new JSONObject();
        info4.put("value", "5");
        info4.put("price", "5000");
        info4.put("label", "士兵_2级骑兵");

        JSONObject info5 = new JSONObject();
        info5.put("value", "6");
        info5.put("price", "6000");
        info5.put("label", "士兵_2级炮兵");

        JSONArray dataArray = new JSONArray();
        dataArray.add(info);
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

    /**
     *   查询
     * @param params
     * @return
     */
    @RequestMapping(value = "/prop", method = RequestMethod.POST)
    public JSON prop(@RequestBody String params) {
        JSONObject info = new JSONObject();
        info.put("value", "1");
        info.put("price", "1");
        info.put("label", "索菲亚");

        JSONObject info1 = new JSONObject();
        info1.put("value", "2");
        info1.put("price", "2");
        info1.put("label", "安吉");

        JSONObject info2 = new JSONObject();
        info2.put("value", "3");
        info2.put("price", "3");
        info2.put("label", "娜塔莎");

        JSONObject info3 = new JSONObject();
        info3.put("value", "4");
        info3.put("price", "4");
        info3.put("label", "伊莲");

        JSONObject info4 = new JSONObject();
        info4.put("value", "5");
        info4.put("price", "5");
        info4.put("label", "小芳");


        JSONArray dataArray = new JSONArray();
        dataArray.add(info);
        dataArray.add(info1);
        dataArray.add(info2);
        dataArray.add(info3);
        dataArray.add(info4);

        ResponseModel responseModel = new ResponseModel();
        responseModel.setRet(0);
        responseModel.setData(dataArray);
        return (JSON) JSON.toJSON(responseModel);
    }




}
