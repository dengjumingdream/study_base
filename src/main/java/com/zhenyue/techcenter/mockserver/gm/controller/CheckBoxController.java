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
@RequestMapping("local/checkbox")
public class CheckBoxController {

    public static JSONObject jsonObject = new JSONObject();

    /**
     *   查询
     * @param params
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public JSON list(@RequestBody String params) {
        JSONObject info = new JSONObject();
        info.put("people", "1");
        info.put("gold", "1");

        JSONObject info1 = new JSONObject();
        JSONArray peopleArray = new JSONArray();
        peopleArray.add("1");
        peopleArray.add("2");
        peopleArray.add("3");
        info1.put("people", peopleArray);
        info1.put("gold", "2");

        JSONObject info2 = new JSONObject();
        JSONArray goldArray = new JSONArray();
        goldArray.add("1");
        goldArray.add("2");
        goldArray.add("3");
        goldArray.add("4");
        goldArray.add("5");
        goldArray.add("6");
        goldArray.add("7");
        goldArray.add("8");
        goldArray.add("9");
        goldArray.add("10");

        // 动态栅格
        JSONArray titleArray = new JSONArray();
        JSONObject _tempInfo1 = new JSONObject();
        _tempInfo1.put("id", "en");
        _tempInfo1.put("content", "aaa");
        JSONObject _tempInfo2 = new JSONObject();
        _tempInfo2.put("id", "en");
        _tempInfo2.put("content", "bbb");
        titleArray.add(_tempInfo1);
        titleArray.add(_tempInfo2);

        JSONArray subTitleArray = new JSONArray();
        JSONObject _subtempInfo1 = new JSONObject();
        _subtempInfo1.put("id", "fr");
        _subtempInfo1.put("content", "sub_a");
        JSONObject _subtempInfo2 = new JSONObject();
        _subtempInfo2.put("id", "en");
        _subtempInfo2.put("content", "sub_b");
        subTitleArray.add(_subtempInfo1);
        subTitleArray.add(_subtempInfo2);

        JSONArray contentArray = new JSONArray();
        JSONObject _contentInfo1 = new JSONObject();
        _contentInfo1.put("id", "fr");
        _contentInfo1.put("content", "conte_a");
        JSONObject _contentInfo2 = new JSONObject();
        _contentInfo2.put("id", "en");
        _contentInfo2.put("content", "conte_b");
        contentArray.add(_contentInfo1);
        contentArray.add(_contentInfo2);

        info2.put("people", peopleArray);
        info2.put("gold", goldArray);
        info2.put("title", titleArray);
        info2.put("subtitle", subTitleArray);
        info2.put("lan", contentArray);

        JSONArray dataArray = new JSONArray();
        dataArray.add(info);
        dataArray.add(info1);
        dataArray.add(info2);

        ResponseModel responseModel = new ResponseModel();
        responseModel.setRet(0);
        responseModel.setData(dataArray);
        return (JSON) JSON.toJSON(responseModel);
    }

    /**
     * 获取下拉信息
     * @param params
     * @return
     */
    @RequestMapping(value = "/info", method = RequestMethod.POST)
    public JSON queryInfo(@RequestBody String params) {

        JSONObject info = new JSONObject();
        info.put("value", "1");
        info.put("price", "1000");
        info.put("label", "小黄蜂");

        JSONObject info1 = new JSONObject();
        info1.put("value", "2");
        info1.put("price", "2000");
        info1.put("label", "大黄蜂");

        JSONObject info2 = new JSONObject();
        info2.put("value", "3");
        info2.put("price", "3000");
        info2.put("label", "小矿山");

        JSONObject info3 = new JSONObject();
        info3.put("value", "4");
        info3.put("price", "4000");
        info3.put("label", "大矿山");

        JSONObject info4 = new JSONObject();
        info4.put("value", "5");
        info4.put("price", "5000");
        info4.put("label", "小店铺");

        JSONObject info5 = new JSONObject();
        info5.put("value", "6");
        info5.put("price", "6000");
        info5.put("label", "大店铺");

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

}
