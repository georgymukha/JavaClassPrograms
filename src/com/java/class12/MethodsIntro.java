package com.java.class12;

import java.util.Scanner;

public class MethodsIntro {
    public static void main(String[] args) {
        double num = calculateTax();
        sayHello();
        calculateTax2();

        Scanner sc = new Scanner(System.in);
        System.out.print("Where do you want to travel? ");
        String country = sc.nextLine();
        travelTo(country);

    }
    public static void travelTo(String country) {
        System.out.println("I want to travel to " + country);
    }

    // first put an access modifier -> public, private, protected, default
    // second put a static
    // return data type -> any data type -> int, double, float, byte, char, short, boolean, String
    // what is return data type? => it's the data type of the result info of the function(Method)
    // return data type can also be void -> use void when you want to create a method
    // that doesn't return any result -> for ex. just print some info
    // next we have the name of the method -> name of the method should meaningful and follow camelCase. verbs
    // ex. sendEmail(), sendReceipt(), printTop10Customers()
    // the name of the method always finishes with parenthesis.

    public static double calculateTax() {
        return 10*2;
    }

    public static int sayHello() {
        int year = 2023;
        int targetSalary = 130000;
        System.out.println("Hello " + year);
        System.out.println("My target salary is $" + targetSalary);
        return targetSalary;
    }
    public static void calculateTax2() {
        int salary = sayHello();
        int percent = 0;
        if (salary >= 100000) percent = 10;
        else percent = 15;
        System.out.println("Tax percent is " + percent + "%");
    }


}
