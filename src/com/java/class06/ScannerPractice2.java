package com.java.class06;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is " + age);
        System.out.print("Please enter your credit score between 0-820: ");
        int creditScore = sc.nextInt();
        System.out.println("Your credit score is " + creditScore);

        System.out.print("Please enter your marital status (true or false): ");
        Boolean isMarried = sc.nextBoolean();
        String maritalStatus;
        if (isMarried) {
            maritalStatus = "married";
        } else {
            maritalStatus = "single";
        };
        System.out.println("Your marital status is " + maritalStatus);
    }
}
