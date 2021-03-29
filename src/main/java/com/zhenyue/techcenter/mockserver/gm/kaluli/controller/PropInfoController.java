package com.zhenyue.techcenter.mockserver.gm.kaluli.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zhenyue.techcenter.mockserver.gm.model.ResponseModel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gmPlat/RewardList")
public class PropInfoController {

    /**
     *   查询
     * @param params
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public JSON list(@RequestBody String params) {

        JSONObject childObj1 = new JSONObject();
        childObj1.put("value", "1");
        childObj1.put("label", "正常版本");
        JSONObject childObj2 = new JSONObject();
        childObj2.put("value", "2");
        childObj2.put("label", "高级配置");
        JSONArray child1 = new JSONArray();
        child1.add(childObj1);
        child1.add(childObj2);


        JSONObject info1 = new JSONObject();
        info1.put("children", child1);
        info1.put("value", "ryzl");
        info1.put("label", "荣耀战令");
        info1.put("operation_desc", child1);
        info1.put("id", "荣耀战令");
        info1.put("version", "1-正常版本");
        info1.put("desc", "荣耀战令");



        JSONObject childObjB1 = new JSONObject();
        childObjB1.put("value", "1");
        childObjB1.put("label", "正常版本");
        JSONObject childObjB2 = new JSONObject();
        childObjB2.put("value", "2");
        childObjB2.put("label", "高级配置");
        JSONArray childB1 = new JSONArray();
        childB1.add(childObjB1);
        childB1.add(childObjB2);

        JSONObject info2 = new JSONObject();
        info2.put("value", "kcc");
        info2.put("label", "快餐车");
        info2.put("children", childB1);
        info2.put("operation_desc", "快餐车");
        info2.put("id", 1002);
        info2.put("version", "1-正常版本");
        info2.put("desc", "快餐车");


        JSONArray data = new JSONArray();
        data.add(info1);
        data.add(info2);

        ResponseModel responseModel = new ResponseModel();
        responseModel.setRet(0);
        responseModel.setData(data);
        return (JSON) JSON.toJSON(responseModel);
    }
}
