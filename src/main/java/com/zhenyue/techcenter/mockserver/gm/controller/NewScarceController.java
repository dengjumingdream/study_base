package com.zhenyue.techcenter.mockserver.gm.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zhenyue.techcenter.mockserver.gm.model.ResponseModel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("local/newScarce")
public class NewScarceController {

    /**
     *   查询
     * @param params
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String list(@RequestBody String params) {

        JSONObject info1 = new JSONObject();
//        info1.put("zoneid", "1001");
        info1.put("sendTime", 1610347586000l);
        info1.put("expireTime", 1613025986000l);
        info1.put("createdAt", 1610347586000l);
        info1.put("uids", "1001");
        info1.put("versionNum", "v1.0");
        info1.put("prop_1", "1");
        info1.put("num_1", 5);

        // title
        JSONArray titleArray = new JSONArray();
        JSONObject titleInfo1 = new JSONObject();
        titleInfo1.put("id", "en");
        titleInfo1.put("content", "I'm from China");
        titleArray.add(titleInfo1);
        info1.put("title", titleArray);

        // subtitle
        JSONArray subTitleArray = new JSONArray();
        JSONObject subTitleInfo1 = new JSONObject();
        subTitleInfo1.put("id", "en");
        subTitleInfo1.put("content", "I'm from China");
        subTitleArray.add(subTitleInfo1);
        info1.put("subtitle", subTitleArray);

        // content
        JSONArray contentArray = new JSONArray();
        JSONObject contentInfo1 = new JSONObject();
        contentInfo1.put("id", "en");
        contentInfo1.put("content", "I'm from China");
        contentArray.add(subTitleInfo1);
        info1.put("content", contentArray);

        JSONArray data = new JSONArray();
        data.add(info1);
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
