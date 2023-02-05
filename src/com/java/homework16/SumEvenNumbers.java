package com.java.homework16;

public class SumEvenNumbers {
    public static void main(String[] args) {
        System.out.println("Sum of even numbers from 1 to 10:");
        sumEvenNumbers();
    }
    public static void sumEvenNumbers() {
        int sum = 0;
        for (int i = 0; i <= 10; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
