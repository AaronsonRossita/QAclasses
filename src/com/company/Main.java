package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x = 5;
        Scanner sc = new Scanner(System.in);
//      class    object     constructor
//        Student student1 = new Student();
//        Student student2 = new Student("Only Name");
//        Student student3 = new Student("Victor",35,true);
//
//        System.out.println("Before: ");
//        System.out.println(student1.name);
//        System.out.println(student1.age);
//        System.out.println(student1.active);
//        System.out.println("------------");
//
//        student1.name = "Victor";
//        student1.age = 35;
//        student1.active = true;
//
//        System.out.println("After: ");
//        System.out.println(student1.name);
//        System.out.println(student1.age);
//        System.out.println(student1.active);
//
//        Student first = new Student("Amy",28,true);
//        Student second = new Student("Mike",34,false);
//        Student third = new Student("Hatul",8,false);
//
//        System.out.println(first.name);
//        System.out.println(second.name);
//        System.out.println(third.name);
        Employee employee1 = new Employee();
//        System.out.println(employee1.education);
//        System.out.println(employee1.id);
//        System.out.println(employee1.name);
//        System.out.println("------------");
//
//        employee1.education = true;
//        employee1.id = 7364284;
//        employee1.name = "Name Lastname";
//
//        System.out.println(employee1.education);
//        System.out.println(employee1.id);
//        System.out.println(employee1.name);

        Employee employee2 = new Employee(325255,"New Employee", false);
//        System.out.println(employee2.name);
//        System.out.println(employee2.id);
//        System.out.println(employee2.education);
//
//        employee2.id = 676878;
//
//        System.out.println(employee2.id);
//
//        employee2.printId();
//        employee2.printName();
//
//        Employee.staticExample();
        Calculator calculator = new Calculator();
//        int newInt = Calculator.sub(5,4);
//        System.out.println(newInt);
        System.out.println(Calculator.sub(5,4));
    }


}
