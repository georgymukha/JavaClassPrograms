package com.java.class08;

import java.util.Scanner;

public class NumberOfDaysInEachMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = 0;
        while (month>12 || month<1) {
            System.out.print("Select the month (1-12): ");
            month = sc.nextByte();
            if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
                System.out.println(31);
            else if (month==2) System.out.println(28);
            else if (month==4 || month==6 || month==9 || month==11) System.out.println(31);
            else System.out.println("Wrong entry. You can enter only number between 1 and 12." +
                        "\nPlease try again!");
        }

    }
}
