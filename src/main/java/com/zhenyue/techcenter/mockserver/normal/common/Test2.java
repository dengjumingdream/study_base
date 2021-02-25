package com.zhenyue.techcenter.mockserver.normal.common;

import com.zhenyue.techcenter.mockserver.algorithm.modal.Student;

public class Test2 {

    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(1);
        student.setName("Peter");
        System.out.println(student.getAge());
    }
}
