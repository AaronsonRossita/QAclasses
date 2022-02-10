package com.company;

public class Employee {

    int id;
    String name;
    boolean education;

    public Employee() {

    }

    public Employee(int id, String name, boolean education) {
        this.id = id;
        this.name = name;
        this.education = education;
    }

    public void printId(){
        System.out.println(this.id);
    }

    public void printName(){
        System.out.println(this.name);
    }

    static public void staticExample(){
        System.out.println("static function");
    }

}
