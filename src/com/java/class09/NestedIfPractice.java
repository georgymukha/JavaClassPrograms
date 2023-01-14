package com.java.class09;

import java.util.Scanner;

public class NestedIfPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary = sc.nextInt();
        System.out.print("Enter your age: ");
        byte age = sc.nextByte();
        if (age < 18) {
            System.out.println("You're not eligible");
        } else {
            if (salary < 5000) {
                System.out.println("Sorry, you need work hard to get credit card");
            } else if (salary < 20000) {
                System.out.println("You're eligible");
            } else System.out.println("You'll get free credit card");
        }
    }
}
