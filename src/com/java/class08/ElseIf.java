package com.java.class08;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean hasLicense = false;
        int speed = 90;

        if (hasLicense && speed < 80) {
            System.out.println("Have a safe Journey");
        } else if (hasLicense && speed > 80) {
            System.out.println("Here is your speeding ticket");
        } else if (!hasLicense && speed < 80) {
            System.out.println("We have to tow your car");
        } else if (!hasLicense && speed > 80) {
            System.out.println("You must appear in the court");
        }
    }
}
