package com.java.homework13;

public class PrintOutOddNumbers {
    public static void main(String[] args) {
        System.out.println("Odd numbers from 1 to 20:");
        oddNumbersPrinter();
    }
    public static void oddNumbersPrinter() {
        byte counter = -1;
        while (counter < 19) {
            System.out.println(counter += 2);
        }
    }
}
