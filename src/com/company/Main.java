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
//        System.out.println(Calculator.sub(5,4));

//        int[] arr = {1,2,3,4,5};
//        System.out.println(Calculator.sumOfArr(arr));
//        System.out.println(Calculator.sumOfArrEach(arr));

        Car car1 = new Car();
        Car car2 = new Car("Seat", "Leon",
                                    3, true);
        Car car3 = new Car("Kia","Sportage",
                                    5,false);

//        car2.model();
//        car3.model();
//
//        car2.ride();

//        Car.howTo();

//        System.out.println("words words");
//        System.out.println("words" +
//                           " words");
//        System.out.println("words \nwords " + x);

//        car1.model();
//        car2.model();
//
//        addParameters(car1);
//        addParameters(car2);
//
//        car1.model();
//        car2.model();

        createCar().model();

    }

    public static void addParameters(Car temp){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls provide company name");
        temp.companyName = sc.nextLine();
        System.out.println("Pls provide model name");
        temp.model = sc.nextLine();
        System.out.println("Pls provide the number of doors");
        temp.doors = sc.nextInt();
        System.out.println("Is the car automatic true or false");
        temp.automatic = sc.nextBoolean();
    }

    public static Car createCar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls provide string for company name, string for model, int for doors and boolean for gear");
        Car temp = new Car(sc.nextLine(), sc.nextLine(), sc.nextInt(),sc.nextBoolean());
        return temp;
    }

}
