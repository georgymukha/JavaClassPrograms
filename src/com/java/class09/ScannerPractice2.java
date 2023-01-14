package com.java.class09;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        // ask user for their gender in char
        // and if the user gender is M then print out -> go work hard
        // and if the user gender is F then print out -> enjoy your life
        // if the user gender input is not M or F then printout -> wrong input

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your gender (M or F): ");
        String gender = String.valueOf(sc.next().charAt(0));
        if (gender.equalsIgnoreCase("m")) {
            System.out.println("Go work hard!");
        } else if (gender.equalsIgnoreCase("f")) {
            System.out.println("Enjoy your life darling!");
        } else {
            System.out.println("Wrong input");
        }
    }
}
