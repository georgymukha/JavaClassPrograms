package com.java.homework04;

import java.util.Scanner;

public class CreditLanding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = sc.nextInt();
        System.out.print("Please enter your credit score between 0-820: ");
        int creditScore = sc.nextInt();
        if (creditScore < 0 || creditScore > 820) {
            while (creditScore >= 0 && creditScore <= 820) {
                System.out.println("Enter valid number between 0 and 820: ");
                creditScore = sc.nextInt();
            }
        }
        System.out.print("Please enter your marital status (true or false): ");
        Boolean isMarried = sc.nextBoolean();

        System.out.println("Approved: " + (isMarried && age > 25 && creditScore > 700));
    }
}
