package com.java.class13;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num1 = sc.nextInt();


    }
    public boolean threeOrFive(int num) {
        if (num % 3 == 0) return true;
        return false;
    }
}
