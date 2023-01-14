package com.java.homework05;

import java.util.Scanner;

public class ConnectingFlight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Kyrgyz AirLines!");
//        System.out.print("Are you travelling from connecting flight(true/false): ");
//        boolean connectingFlight = sc.nextBoolean();
//        if (!connectingFlight) System.out.println("Please proceed to the security check!");
        System.out.print("Are you travelling from connecting flight(yes/no): ");
        String connectingFlight = sc.nextLine();
        if (connectingFlight.equalsIgnoreCase("yes"))
            System.out.println("Please proceed to the security check!");
        System.out.println("Enjoy your flight.");
    }
}
