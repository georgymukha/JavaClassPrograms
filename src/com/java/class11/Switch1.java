package com.java.class11;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {

//        String shipmentState = "Alaska";
//        switch (shipmentState) {
//            case "Alaska":
//                System.out.println("Shipment cost is $10");
//                break;
//            case "Hawaii":
//                System.out.println("Shipment cost is $5");
//                break;
//            case "NY":
//                System.out.println("Shipment cost is $7");
//                break;
//            case "Florida":
//                System.out.println("Shipment cost is $12");
//                break;
//            case "California":
//                System.out.println("Shipment cost is $8");
//                break;
//        }
        Scanner sc = new Scanner(System.in);
        int month = 0;
        int days = 0;
        while (month>12 || month<1) {
            System.out.print("Select the month (1-12): ");
            month = sc.nextByte();
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 2:
                    days = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                default:
                    System.out.println("Wrong entry. You can enter only number between 1 and 12." +
                            "\nPlease try again!");
                    break;
            }
        }
        System.out.println(days + " days in this month");
    }
}
