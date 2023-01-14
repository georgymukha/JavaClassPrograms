package com.java.class10;

import java.util.Scanner;

public class IfStatementRecap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Number 2: ");
        int num2 = sc.nextInt();
        System.out.print("Number 3: ");
        int num3 = sc.nextInt();
        int theLargestNum;
        if (num1 >= num2 && num1 >= num3) {
            theLargestNum = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            theLargestNum = num2;
        } else if (num3 > num2 && num3 > num1) {
            theLargestNum = num3;
        } else if (num1 > num2 || num1 > num3) {
            theLargestNum = num1;
        } else if (num2 > num1 || num2 > num3) {
            theLargestNum = num2;
        } else if (num3 > num2 || num3 > num1) {
            theLargestNum = num3;
        }
    }
}
