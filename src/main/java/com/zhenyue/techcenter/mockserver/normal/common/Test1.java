package com.zhenyue.techcenter.mockserver.normal.common;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.concurrent.LinkedBlockingQueue;

public class Test1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        MathOperation mathOperation = (int a, int b) -> a + b;

        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();

        int sum = mathOperation.operation(1, 3);
        System.out.println(sum);
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
    }

    interface MathOperation{
        int operation(int a, int b);
    }
}
