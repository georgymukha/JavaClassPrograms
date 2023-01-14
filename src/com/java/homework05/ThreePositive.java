package com.java.homework05;

import java.util.Scanner;

public class ThreePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To find average of 3 numbers, follow instructions below.");
        System.out.print("Input 1: ");
        int num1 = sc.nextInt();
        System.out.print("Input 2: ");
        int num2 = sc.nextInt();
        System.out.print("Input 3: ");
        int num3 = sc.nextInt();
        double avg = (num1 + num2 + num3)/3;
        System.out.println("Output: " + avg);
    }
}
