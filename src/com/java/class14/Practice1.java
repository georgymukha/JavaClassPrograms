package com.java.class14;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text = sc.nextLine();
        lastCharOfTheString(text);
    }

    public static void lastCharOfTheString(String input) {
        System.out.println("Last char is:");
        System.out.println(input.charAt(input.length()-1));
    }
}
