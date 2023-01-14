package com.java.class07;

import java.util.Scanner;

public class TypeCasting {

    // Error types in Java

    public static void main(String[] args) {

        double gasPrice = 1.99;
//        int wholeNumber = gasPrice; // incompatible types compilation error

//        int b = 10.5; // incompatible types compilation error

        int a = 40;
//        short smallNum = a; // incompatible types compilation error

        // explicit type casting -> manual
        double price = 2.99;
        //(int) is a type casting operator
        int convert = (int) price;
//        System.out.println(convert);

        double  num2 = 9.01;
        int convert2 = (int) num2;
//        System.out.println(convert2);

        float floatNum = 2.4f;
        //convert float into a byte
        // and print out byte number
        byte byteNum = (byte) floatNum;
//        System.out.println(byteNum);

        // implicit type casting -> automatic
        int num1 = 24;
        double doubleNum = num1;
//        System.out.println(doubleNum);


        //I want to get Average customer Spending on my products
        //I sold $4,544,950.96
        //64 clients
        // whenever you have a double and int in one math expression
        // you should have a double a result
        // implicit casting
        byte clients = 64;
        double income = 4544950.96;
        double averageCustomer = income/clients;
//        System.out.println(averageCustomer);

        double fuel = 2.4;
        int distance = 100;
        double result = distance/fuel;
//        System.out.println(result + " miles per gallon");
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();
//        if (age >= 16) System.out.println("You're eligible to drive"); else System.out.println("You aren't eligible to drive");
        System.out.print("Enter temperature in fahrenheit: ");
        int weather = sc.nextInt();
        if (weather<32) System.out.println("It's freezing. Stay home");
        if (weather>=32 && weather<41) System.out.println("It's little chilly outside");
        if (weather>=42 && weather<68) System.out.println("It's a good weather outside. Go get some fresh air");
    }
}
