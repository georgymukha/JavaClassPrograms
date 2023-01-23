package com.java.homework13;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to print out multiplication table: ");
        int num = sc.nextInt();
        multiplicationTable(num);
    }
    public static void multiplicationTable(int num) {
        printOutTableRow(num, 10);
    }
    public static void printOutTableRow(int num, int rows) {
        int counter = 1;
        while (counter <= rows) {
            System.out.println(num + " * " + counter + " = " + num * counter++);
        }
    }
}
