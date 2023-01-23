package com.java.homework13;

public class SumLoopedNumbers {
    public static void main(String[] args) {
        int numberToLoopSum = 10;
        System.out.println("Sum of the numbers from 1 to " + numberToLoopSum);
        sumLoopedNums(numberToLoopSum);
    }
    public static void sumLoopedNums(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num--;
        }
        System.out.println(sum);
    }
}
