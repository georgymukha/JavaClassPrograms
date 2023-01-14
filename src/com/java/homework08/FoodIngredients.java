package com.java.homework08;

import java.util.Scanner;

public class FoodIngredients {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to our restaurant!");

        byte dish;
        byte food;
        byte drink;
        do {
            System.out.println("FOOD INGREDIENTS");
            System.out.println("1. Appetizer");
            System.out.println("2. Main course");
            System.out.print("Select the option above (1 or 2): ");
            food = sc.nextByte();
            if (food == 1) {
                System.out.println("1. Spring rolls");
                System.out.println("2. Egg rolls");
                System.out.print("Select the option above (1 or 2): ");
                dish = sc.nextByte();
                if (dish == 1) {
                    System.out.println("Spring roll ingredients...");
                } else if (dish == 2) {
                    System.out.println("Egg roll ingredients...");
                } else System.out.println("Invalid app");
            } else if (food == 2) {
                System.out.println("1. Lagman");
                System.out.println("2. NY Rib Eye Steak");
                System.out.print("Select the option above (1 or 2): ");
                dish = sc.nextByte();
                if (dish == 1) {
                    System.out.println("Lagman ingredients...");
                } else if (dish == 2) {
                    System.out.println("NY Rib Eye ingredients...");
                }
            } else System.out.println("Invalid choice");
        } while (food >2 || food <1);
        do {
            System.out.println("DRINKS INGREDIENTS");
            System.out.println("1. Orange Juice");
            System.out.println("2. Apple Juice");
            System.out.println("3. Pineapple Juice");
            System.out.print("Select the option above (1-3): ");
            drink = sc.nextByte();
            if (drink == 1) {
                System.out.println("#oranges");
            } else if (drink == 2) {
                System.out.println("#apples");
            } else if (drink == 3) {
                System.out.println("#pineapples");
            } else System.out.println("Invalid choice");
        } while (drink >3 || drink <1);
    }
}
