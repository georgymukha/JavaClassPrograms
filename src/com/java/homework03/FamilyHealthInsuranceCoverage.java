package com.java.homework03;

public class FamilyHealthInsuranceCoverage {
    public static void main(String[] args) {
        int     clientCreditScore = 960;
        boolean clientMaritalStatus = true;
        byte    numberOfChildren = 3;

        boolean giveFamilyHealthInsuranceCoverage =
                clientCreditScore > 680 &&
                clientMaritalStatus == true &&
                numberOfChildren > 2;
        System.out.println(giveFamilyHealthInsuranceCoverage);
    }
}
