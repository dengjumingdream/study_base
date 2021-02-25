package com.zhenyue.techcenter.mockserver.gm.model;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ResponseModel {

    private String cmd;

    private String secret;

    private String gmtoken;

    /**
     * 返回结果状态 - 0
     */
    private Integer ret;

    /**
     * 返回状态信息 - success
     */
    private String msg;

    /**
     * 返回结果信息
     */
    private JSONArray data;

    @Override
    public String toString() {
        JSONObject result = new JSONObject();
        result.put("cmd", cmd);
        result.put("ret", ret);
        result.put("data", data);
        return result.toJSONString();
    }
}
