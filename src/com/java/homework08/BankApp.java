package com.java.homework08;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte interestRate;

        System.out.println("BANK APP");
        System.out.print("Please enter how much you want to loan: ");
        int loanAmount = sc.nextInt();
        System.out.print("Please enter your credit score: ");
        short creditScore = sc.nextShort();
        if (loanAmount < 10000) {
            if (creditScore < 600) interestRate = 15;
            else interestRate = 10;
        } else {
            if (creditScore < 600) interestRate = 12;
            else interestRate = 8;
        }
        System.out.println("Your interest rate is "+ interestRate + "%");
    }
}
