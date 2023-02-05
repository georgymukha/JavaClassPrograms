package com.java.homework16;

public class FindSumOfSquares {
    public static void main(String[] args) {
        System.out.println("Sum of squares from 1 to 5:");
        sumOfSquares();
    }
    public static void sumOfSquares() {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i * i;
        }
        System.out.println(sum);
    }
}
