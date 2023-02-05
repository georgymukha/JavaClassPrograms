package com.java.homework17;
import java.util.Scanner;
public class PrintSumOfEachDigitInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sum of each digit in number: ");
        sumOfEachDigitInNumber(sc.nextInt());
    }
    public static void sumOfEachDigitInNumber(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
