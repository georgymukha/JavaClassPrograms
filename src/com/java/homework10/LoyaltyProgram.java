package com.java.homework10;

import java.util.Scanner;

public class LoyaltyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to other coffee shop!");
        System.out.print("Are you a member of our loyalty program (true or false)? ");
        boolean member = sc.nextBoolean();
        System.out.print("Please enter the cost of purchase: ");
        double purchase = sc.nextDouble();

        System.out.println("Final cost is " + discountCalculator(member, purchase));
    }

    public static double discountCalculator(boolean member, double costOfPurchase) {
        if (member) costOfPurchase *= 0.9;
        return costOfPurchase;
    }
}
