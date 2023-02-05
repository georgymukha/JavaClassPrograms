package com.java.homework17;

import java.util.Scanner;

public class PrintGreatestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        System.out.println("Greatest digit of the number is " + greatestDigit(sc.nextInt()));
    }
    public static int greatestDigit(int num) {
        int greatestDigit = 0;
        while (num > 0) {
            if (num % 10 > greatestDigit) {
                greatestDigit = num % 10;
            }
            num /= 10;
        }
        return greatestDigit;
    }
}
