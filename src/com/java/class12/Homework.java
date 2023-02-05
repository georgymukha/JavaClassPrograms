package com.java.class12;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Write your height in metres: ");
        double height = sc.nextDouble();
        heightFeetInches(height);
    }

    public static void heightFeetInches(double height) {
        System.out.println("Your height in inches " + height * 39.34 + " and it's also " + height * 3.28084 + " in feets");
    }
}