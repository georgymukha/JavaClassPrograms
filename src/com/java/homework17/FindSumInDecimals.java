package com.java.homework17;

public class FindSumInDecimals {
    public static void main(String[] args) {
        System.out.print("Sum in decimals: ");
        sumInDecimals();
    }
    public static void sumInDecimals() {
        double sum = 0;
        for (double i = 1, j = 2; i <= 10; i++, j++) {
            sum += i / j;
        }
        System.out.println(sum);
    }
}
