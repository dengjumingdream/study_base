package com.zhenyue.techcenter.mockserver.selftest.common;

import com.zhenyue.techcenter.mockserver.selftest.common.modal.Student;

public class Test2 {

    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(1);
        student.setName("Peter");
        System.out.println(student.getAge());
    }
}
