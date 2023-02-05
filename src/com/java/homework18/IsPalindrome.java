package com.java.homework18;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();
        isPalindrome(num);
    }
    public static void isPalindrome(int num) {
        int reverse = 0;
        int def = num;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        if (def == reverse) System.out.println("The number is a palindrome");
        else System.out.println("The number is not a palindrome");
    }
}
