package com.java.homework05;

import java.util.Scanner;

public class JavaExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many exercises are you loving per day?");
        System.out.print("Usually I solve: ");
        int exercises = sc.nextInt();
        if (exercises < 3)
            System.out.println("You're too lazy!");
        else if (exercises < 5)
            System.out.println("Good job, but you should do better!");
        else System.out.println("Great job! You are on the right track!");
    }
}
