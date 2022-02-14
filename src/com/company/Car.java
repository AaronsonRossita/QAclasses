package com.company;

public class Car {

    String companyName;
    String model;
    int doors;
    boolean automatic;

    public Car() {
    }

    public Car(String companyName, String model, int doors, boolean automatic) {
        this.companyName = companyName;
        this.model = model;
        this.doors = doors;
        this.automatic = automatic;
    }

    public void model(){
        System.out.println("------------");
        System.out.println("The company name is : " + this.companyName);
        System.out.println("The model of the car is : " + this.model);
        System.out.println("The amount of doors is : " + this.doors);
//        System.out.println("Is the gear automatic : " + this.automatic);
        if (automatic){
            System.out.println("This car has automatic gear");
        }else{
            System.out.println("This car is stick");
        }
        System.out.println("------------");
    }

    public void ride(){
        System.out.println("This car is riding " + this.model);
    }

    public static void howTo(){
        System.out.println("To create an object of class Car pls provide" +
                " Company Name, Model, Number of doors and if its automatic");
    }

}
