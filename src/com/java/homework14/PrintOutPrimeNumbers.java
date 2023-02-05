package com.java.homework14;

public class PrintOutPrimeNumbers {
    public static void main(String[] args) {
        printPrimeNumbers();
    }
    public static void printPrimeNumbers() {
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
