package com.java.class09;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean outerBoolean = true;
        boolean innerBoolean = false;

        // first if statement scope {} -> is outer if statement
        // if line 12 if statement is false
        if (true) {
            System.out.println("Outer 6.1");
            if (false) {
                System.out.println("Inner Hi 6");
            }
            System.out.println("Outer 6.2");

        }
    }
}
