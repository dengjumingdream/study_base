package com.zhenyue.techcenter.mockserver.algorithm.modal;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

@Data
public class Student {

    private String name;

    private Integer age;

    @Override
    public String toString() {
        JSONObject resultJson = new JSONObject();
        resultJson.put("name", name);
        age = 15;
        return resultJson.toJSONString();
    }
}
