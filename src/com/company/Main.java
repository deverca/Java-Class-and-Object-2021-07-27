package com.company;

import model.Student;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Carmela Luise De Vera",21,'F',"2015105507");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
        System.out.println(student.getStudNum());

    }
}
