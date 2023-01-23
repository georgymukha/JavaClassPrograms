package com.java.homework12;

import java.util.Scanner;

public class StringStartsWithHi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String string = sc.nextLine();
        System.out.println("Starts with \"hi\" - " + isStringStartsWithHi(string));
    }

    public static boolean isStringStartsWithHi(String string) {
        return string.startsWith("hi");
    }
}
