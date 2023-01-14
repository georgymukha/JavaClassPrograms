package com.java.homework07;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        int salary = sc.nextInt();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your desired loan amount: ");
        int loanAmount = sc.nextInt();
        if (age < 18) System.out.println("You're not eligible");
        else {
            if (salary <= 1000) System.out.println("Not eligible salary");
            else if (salary <= 5000) {
                System.out.println("Limit 10000");
                if (loanAmount <= 5000) System.out.println("No Deduction In Limit");
                else if (loanAmount <= 10000) System.out.println("Deduct Half Of The Loan Amount From Credit Card Limit");
                else System.out.println("Loan amount not eligible");
            }
            else if (salary <= 10000) {
                System.out.println("Limit 20000");
                if (loanAmount <= 5000) System.out.println("No Deduction In Limit");
                else if (loanAmount <= 20000) System.out.println("Deduct Half Of The Loan Amount From Credit Card Limit");
                else System.out.println("Loan amount not eligible");
            }
            else if (salary <= 20000) {
                System.out.println("Limit 50000");
                if (loanAmount <= 5000) System.out.println("No Deduction In Limit");
                else if (loanAmount <= 20000) System.out.println("Deduct Half Of The Loan Amount From Credit Card Limit");
                else System.out.println("Loan amount not eligible");
            }
        }
    }
}
