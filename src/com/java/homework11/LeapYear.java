package com.java.homework11;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LeapYear checkIfYearIsLeap = new LeapYear();
        int year = 0;
        while (year <= 0) {
            System.out.print("Enter the year: ");
            year = sc.nextInt();
            if (year <= 0) System.out.println("Wrong input!");
        }
        if (checkIfYearIsLeap.isLeapYear(year)) System.out.println(year + " year is leap");
        else System.out.println(year + " year is not leap");
    }
    public boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && year % 100 == 0) return true;
        else return false;
    }
}
