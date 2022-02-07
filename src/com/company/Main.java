package com.company;

public class Main {

    public static void main(String[] args) {

        int x = 5;
//      class    object     constructor
        Student student1 = new Student();
        Student student2 = new Student("Only Name");
        Student student3 = new Student("Victor",35,true);

        System.out.println("Before: ");
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.active);
        System.out.println("------------");

        student1.name = "Victor";
        student1.age = 35;
        student1.active = true;

        System.out.println("After: ");
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.active);

        Student first = new Student("Amy",28,true);
        Student second = new Student("Mike",34,false);
        Student third = new Student("Hatul",8,false);

        System.out.println(first.name);
        System.out.println(second.name);
        System.out.println(third.name);

    }
}
