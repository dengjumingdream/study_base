package com.zhenyue.techcenter.mockserver.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/test-003")
public class GmRemoteController {

    public static JSONObject jsonObject = new JSONObject();

    /**
     *   查询
     * @param params
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public JSON query(@RequestBody String params) {

        String ret = "0";
        String message = "未找到信息";

        JSONObject role1 = new JSONObject();
        role1.put("key","1");
        role1.put("uid","10001");
        role1.put("pid","001");
        role1.put("roleName","赵子龙");
        role1.put("grade","1");
        role1.put("gold","1001");
        role1.put("diamonds","1001");
        role1.put("picture","001.jpg");

        JSONObject role2 = new JSONObject();
        role1.put("key","2");
        role2.put("uid","10002");
        role2.put("pid","002");
        role2.put("roleName","关云长");
        role2.put("grade","2");
        role2.put("gold","10002");
        role2.put("diamonds","10002");
        role2.put("picture","002.jpg");

        JSONObject role3 = new JSONObject();
        role1.put("key","3");
        role3.put("uid","10003");
        role3.put("pid","003");
        role3.put("roleName","曹孟德");
        role3.put("grade","3");
        role3.put("gold","10003");
        role3.put("diamonds","10003");
        role3.put("picture","003.jpg");

        JSONArray data = new JSONArray();

        System.out.println(params);
        JSONObject enterInfo = JSONObject.parseObject(params);
        String uid = enterInfo.getString("uid");
        if ( uid != null && uid != "") {
            switch (uid) {
                case "001":
                    data.add(role1);
                    break;
                case "002":
                    data.add(role2);
                    break;
                case "003":
                    data.add(role3);
                    break;
                 default:
                     data.add(role1);
                     data.add(role2);
                     data.add(role3);
            }
        } else {
            data.add(role1);
            data.add(role2);
            data.add(role3);
        }
        jsonObject.put("data", data);
        jsonObject.put("ret", ret);
        jsonObject.put("message", message);
        return jsonObject;
    }


    /**
     *   添加
     * @param params
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public JSON add(@RequestBody String params) {

        JSONObject data = JSONObject.parseObject(params);
        String key = "4";
        String uid = data.getString("uid");
        String pid = data.getString("pid");
        String roleName = data.getString("roleName");
        String grade = data.getString("grade");
        String gold = data.getString("gold");
        String diamonds = data.getString("diamonds");
        String picture = data.getString("picture");
        JSONObject role4 = new JSONObject();
        role4.put("key", key);
        role4.put("uid", uid);
        role4.put("pid", pid);
        role4.put("roleName", roleName);
        role4.put("grade", grade);
        role4.put("gold", diamonds);
        role4.put("diamonds", diamonds);
        role4.put("picture", picture);
        JSONArray jsonArray = jsonObject.getJSONArray("data");
        jsonArray.add(role4);
        jsonObject.replace("data", jsonArray);

        String ret = "0";
        String message = "添加成功";

        return jsonObject;
    }


    /**
     *   编辑
     * @param params
     * @return
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public JSON edit(@RequestBody String params) {

        JSONObject data = JSONObject.parseObject(params);
        String key = "4";
        String uid = data.getString("uid");
        String pid = data.getString("pid");
        String roleName = data.getString("roleName");
        String grade = data.getString("grade");
        String gold = data.getString("gold");
        String diamonds = data.getString("diamonds");
        String picture = data.getString("picture");
        JSONObject role4 = new JSONObject();
        role4.put("key", key);
        role4.put("uid", uid);
        role4.put("pid", pid);
        role4.put("roleName", roleName);
        role4.put("grade", grade);
        role4.put("gold", diamonds);
        role4.put("diamonds", diamonds);
        role4.put("picture", picture);
        JSONArray jsonArray = jsonObject.getJSONArray("data");
        jsonArray.add(role4);
        jsonObject.replace("data", jsonArray);

        String ret = "0";
        String message = "添加成功";

        return jsonObject;
    }

}
