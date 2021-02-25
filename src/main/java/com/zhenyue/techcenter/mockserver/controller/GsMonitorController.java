package com.zhenyue.techcenter.mockserver.controller;


import com.alibaba.fastjson.JSONObject;
import com.github.xiaoymin.knife4j.annotations.ApiSort;
import com.zhenyue.techcenter.mockserver.entity.Role;
import entity.CommonResp;
import entity.ErrorConstant;
import exception.GmTokenExceptionHandler;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.GmTokenUtil;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Api(tags = "2.0.2版本-20200226")
@ApiSort(0)
@RestController
public class GsMonitorController {

    @RequestMapping("/getRoleById")
    public String getDitchs(@RequestBody JSONObject param, HttpServletRequest request){
        JSONObject json= param;
        System.out.println("获取角色信息");
        String roleid=json.containsKey("roleid")?json.getString("roleid"):null;
        Role r=new Role(roleid,roleid+"name",new Date(),1,1,0,"","plat1","1",1);
        JSONObject result=new JSONObject();
        result.fluentPut("data",JSONObject.toJSONString(r));
        return result.toJSONString();
    }

    @RequestMapping("/getRoleLoginTime")
    public String getRoleLoginTime(@RequestBody JSONObject param,HttpServletRequest request){
        JSONObject dataJson=param;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("获取游戏最后登录时间");
        String roleid=dataJson.getString("roleid");
        JSONObject jsonObject=new JSONObject();
        long t=System.currentTimeMillis();
        Date date=null;
        try{
            date=sdf.parse("2020-5-20 12:11:20");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        jsonObject.fluentPut("data",date);
        return jsonObject.toJSONString();
    }

    @RequestMapping("/getRoleLoginIpList")
    public String getRoleLoginIpList(@RequestBody JSONObject param,HttpServletRequest request){

        JSONObject dataJson=param;
        System.out.println("获取角色登录IP信息");
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
        String roleid=dataJson.getString("roleid");
        Integer days=dataJson.getInteger("days");
        JSONObject jsonObject=new JSONObject();
        Date date=new Date();
        List<JSONObject> ips=new ArrayList<>();
        for(int i=0;i<days;i++){
            JSONObject ip=new JSONObject();
            if(i==5){
                ip.fluentPut("ip","192.168.8.10").fluentPut("time",formater.format(new Date(date.getTime()-i*24*60*60*1000)));
            }else{
                ip.fluentPut("ip","192.168.8.102").fluentPut("time",formater.format(new Date(date.getTime()-i*24*60*60*1000)));
            }
            ips.add(ip);
        }
        jsonObject.fluentPut("success",true).fluentPut("message","")
                .fluentPut("data",JSONObject.toJSONString(ips));
        return jsonObject.toJSONString();
    }


    @RequestMapping("/forbidRole")
    public String forbidRole(@RequestBody JSONObject param,HttpServletRequest request){
        JSONObject dataJson=param;
        System.out.println("封停角色"+dataJson.getString("roleid"));
        JSONObject jsonObject=new JSONObject();
        jsonObject.fluentPut("data",true);
        return jsonObject.toJSONString();
    }
    @RequestMapping("/getSurplusCoinByRole")
    public String getSurplusCoinByRole(@RequestBody JSONObject param, HttpServletRequest request){
        JSONObject dataJson=param;
        String roleid=dataJson.getString("roleid");
        System.out.println("获取剩余金币"+roleid);
        JSONObject jsonObject=new JSONObject();
        jsonObject.fluentPut("data",JSONObject.toJSONString(new Integer(120)));
        return jsonObject.toJSONString();
    }
}
