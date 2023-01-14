package com.java.homework07;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        System.out.print("Enter number 3: ");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println(a);
        } else {
            if (c > a && c > b) {
                System.out.println(c);
            } else {
                if (b > a && b > c) {
                    System.out.println(b);
                }
            }
        }
    }
}
