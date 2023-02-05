package com.java.homework18;

public class PrintTheStairsWithAsterisk {
    public static void main(String[] args) {
        printStairs(5);
    }
    public static void printStairs(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
