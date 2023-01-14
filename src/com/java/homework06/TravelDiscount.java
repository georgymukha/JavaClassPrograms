package com.java.homework06;

import java.util.Scanner;

public class TravelDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Beverly Hills!");
        System.out.print("Are you traveling first time here(true/false)? ");
        boolean firstTime = sc.nextBoolean();
        if (!firstTime) System.out.println("You have got a 10% discount on your stay.");
        System.out.println("Enjoy your stay here!");
    }
}
