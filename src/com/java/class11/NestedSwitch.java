package com.java.class11;

public class NestedSwitch {
    public static void main(String[] args) {
        String destination = "USA";
        double totalSpending = 720;
        double charge;

        switch ((int) totalSpending) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                charge = 5;
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                charge = 10;
                break;
            default:
                switch (destination) {
                    case "USA":
                        charge = 0.1*totalSpending;
                        break;
                    case "Canada":
                        charge = 0.15*totalSpending;
                        break;
                    case "Europe":
                        charge = 0.2*totalSpending;
                        break;
                    default:
                        charge = 0.25*totalSpending;
                }
                System.out.println("Ship");
        }
        System.out.println("Shipping cost is $" + charge);
    }
}
