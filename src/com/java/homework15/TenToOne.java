package com.java.homework15;

public class TenToOne {
    public static void main(String[] args) {
        System.out.println("Counting down from 10 to 1:");
        countDown();
    }
    public static void countDown() {
        int counter = 10;
        do {
            System.out.println(counter--);
        } while (counter > 0);
    }
}
