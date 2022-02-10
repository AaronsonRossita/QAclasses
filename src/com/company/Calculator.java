package com.company;

public class Calculator {

    public static int sum(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    public static int div(int a ,int b){
        return a / b;
    }

    public static int mult(int a, int b){
        return a * b;
    }

    public static int sumOfArr(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
//          sum = sum + arr[i]
//             {1,2,3}
//           sum = 0 + 1
//           sum = 1 + 2
//           sum = 3 + 3
        }
        return sum;
    }

    public static int sumOfArrEach(int[] arr){
        int sum = 0;
        for (int number : arr) {
            sum += number;
        }
        return sum;
    }



}
