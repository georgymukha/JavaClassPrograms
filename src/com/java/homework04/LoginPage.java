package com.java.homework04;

import java.util.Scanner;

public class LoginPage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your username: ");
        String username = sc.nextLine();
        System.out.print("Please enter your password: ");
        String password = sc.nextLine();
        boolean logIn = username.equals("best@devx.com") && password.equals("Fall2022");
        if (logIn) {
            System.out.println("Login successfully");
        } else {
            System.out.println("Login failed");
        }
    }
}
