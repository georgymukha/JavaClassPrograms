package com.java.homework12;

import java.util.Scanner;

public class SwapLastTwoLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.println(swapLastTwoLetters(str));
    }
    public static String swapLastTwoLetters(String str) {
        str = str.substring(0, str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2);
        return str;
    }
}
