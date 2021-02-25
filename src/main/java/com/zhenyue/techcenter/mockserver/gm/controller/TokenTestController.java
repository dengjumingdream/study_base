package com.zhenyue.techcenter.mockserver.gm.controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import entity.CommonResp;
import entity.ErrorConstant;
import entity.GmTokenModel;
import exception.GmTokenExceptionHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import util.GmTokenUtil;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("gmservice")
public class TokenTestController {

    @Value("${gm.token.secret}")
    private String secret;

    /**
     * @description 获取token
     * @date: 2020/12/15 3:10 PM
     * @author: 邓举名
     */
    @PostMapping("/getToken")
    public String getUserList(@RequestBody JSONObject jsonObject,
                              HttpServletRequest request) {
        String token;
        try {
            GmTokenModel gmTokenModel = JSONObject.parseObject(jsonObject.toJSONString(), GmTokenModel.class);
            token = GmTokenUtil.getGmToken(gmTokenModel, request, secret);
        } catch (Exception e) {
            return null;
        }
        return token;
    }

    /**
     * @description 测试信息
     * @date: 2020/12/15 3:10 PM
     * @author: 邓举名
     */
    @PostMapping("/hero/list")
    public String chekcedToken(@RequestBody JSONObject jsonObject,
                               HttpServletRequest request) {

        CommonResp resp = new CommonResp();
        String gmRequestStr = "";
        String ipAdress = "192.168.101.166";
        try {
            // 校验token方法
//            String gmJsonStr = GmTokenUtil.verifyIdentity(jsonObject, request, secret);
            String gmJsonStr = GmTokenUtil.verifyIdentity(jsonObject, ipAdress, secret);
            JSONObject gmJsonInfo = JSONObject.parseObject(gmJsonStr);
            boolean checked = gmJsonInfo.getBoolean("checked");
            gmRequestStr = gmJsonInfo.getString("result");
            if (!checked) {
                // 说明校验不通过
                resp.setRet(ErrorConstant.FAIL_TOKEN);
                return resp.toString();
            }
        } catch (GmTokenExceptionHandler e) {
            resp.setRet(Integer.valueOf(e.getRet()));
            resp.setMsg(e.getMsg());
            return resp.toString();
        }

        // 获取到 json String 信息
        JSONObject dataJson = JSONObject.parseObject(gmRequestStr);

        // 封装返回给gm - json信息
        JSONArray dataArray = new JSONArray();
        dataArray.add(123);
        dataJson.put("data", dataArray);

        // 进行Encode
        return GmTokenUtil.getEncodeResult(dataJson.toJSONString());
    }
}
