package com.java.class08;

import java.util.Scanner;

public class Practise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary of person 1: ");
        double salary1 = sc.nextDouble();
        System.out.print("Enter salary of person 2: ");
        double salary2 = sc.nextDouble();
        if (salary1>=salary2) System.out.println("Output: " + salary1);
        else System.out.println("Output: " + salary2);
    }
}
