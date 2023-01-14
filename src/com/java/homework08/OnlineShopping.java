package com.java.homework08;

import java.util.Scanner;

public class OnlineShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short weight;
        double shippingCost;

        System.out.println("Delivery cost calculator");
        do {
            System.out.print("Please enter weight of your item in lbs: ");
            weight = sc.nextShort();
            sc.nextLine();
        } while (weight <= 0);
        System.out.print("Please enter shipping country: ");
        String deliveryCountry = sc.nextLine();
        if (deliveryCountry.equalsIgnoreCase("United States")) {
            if (weight < 2) shippingCost = 5;
            else shippingCost = weight * 0.5;
        } else shippingCost = weight * 1.5;
        System.out.println("Your shipping cost is $" + shippingCost);
    }
}
