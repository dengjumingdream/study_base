package com.zhenyue.techcenter.mockserver.normal.reflect;

public class Dog implements Base {

    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    public void sing(){
        System.out.println("dog");
    }
}
