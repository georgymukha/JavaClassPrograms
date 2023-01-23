package com.java.class13;

import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num 1: ");
        String num1 = sc.next();
        System.out.print("Enter num 2: ");
        String num2 = sc.next();
        System.out.println("Result of sum: " + num1.concat(num2));
    }
}
