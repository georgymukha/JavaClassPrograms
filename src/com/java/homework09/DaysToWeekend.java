package com.java.homework09;

import java.util.Scanner;

public class DaysToWeekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Select the day of week from Monday to Sunday: ");
        String day = sc.nextLine();
        byte counter = 0;
        switch (day) {
            case "Monday": counter = 5; break;
            case "Tuesday": counter = 4; break;
            case "Wednesday": counter = 3; break;
            case "Thursday": counter = 2; break;
            case "Friday": counter = 1; break;
            case "Saturday": counter = 7; break;
            case "Sunday": counter = 6; break;
        }
        System.out.println(counter + " days until a next weekend");
    }
}
