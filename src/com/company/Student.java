package com.company;

public class Student {

//    1. Fields שדות
    String name;
    int age;
    boolean active;

//  2.Constructor בנאי
    // בנאי ראשון
    public Student(){

    }

    // בנאי שני
    public Student(String name){
        this.name = name;
    }

    // בנאי שלישי
    public Student(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }


}
