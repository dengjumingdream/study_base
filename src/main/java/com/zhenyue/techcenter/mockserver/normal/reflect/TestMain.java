package com.zhenyue.techcenter.mockserver.normal.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestMain {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Base dog = new Dog();
        Class clazz = dog.getClass();
        System.out.println(clazz.getName());

        Method[] methodName = clazz.getMethods();
        Arrays.stream(methodName).forEach(method -> {
            System.out.println(method.getName());
        });
        Method _method = clazz.getMethod("say", String.class);
        _method.invoke(clazz.newInstance(),"aaa");

        Method _methodSing = clazz.getMethod("sing");
        _methodSing.invoke(clazz.newInstance());

//        Method _method = clazz.getMethod("say");
//        String msg = "aaa";
//        _method.invoke(msg);
    }
}
