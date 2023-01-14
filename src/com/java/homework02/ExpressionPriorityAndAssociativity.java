package com.java.homework02;

public class ExpressionPriorityAndAssociativity {
    public static void main(String[] args) {
        System.out.println(12 + 8 / 3 + 4 / 2 - 3);     // 13
        System.out.println(16 * 10 / (1 + 4) / 2 * 3);  // 48
        System.out.println(2 * 4 * (3 + 4) / (2 * 3));  // 9
        System.out.println(5 * 2 / 10 + 6 / 6 * 6);     // 7
    }
}
