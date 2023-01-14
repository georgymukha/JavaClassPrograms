package com.java.class06;

public class ConditionalOR {
    public static void main(String[] args) {
        byte currentTime=13;

        boolean drinkCoffee = (currentTime >= 6  && currentTime<=11);
//        System.out.println(drinkCoffee);

        int howManyJavaExercises = 0;
        int howManySoftSkillsVideo = 0;
        boolean canIRelaxNow = howManyJavaExercises >= 5 || howManySoftSkillsVideo >= 2;
//        System.out.println(canIRelaxNow);

        //Banking industry application
        byte numberOfLoginAttempts = 0;
        double transactionAmount = 0.0;
        String locationOfTransaction = "USA";

        boolean acceptTransaction = locationOfTransaction == "USA" && numberOfLoginAttempts < 3 && transactionAmount < 3000;
//        System.out.println(acceptTransaction);

        // Login Func
        String userName         = "steve@apple.com";
        String password         = "infinityLoop1";
        String loginLocation    = "california";

        boolean userExist = userName=="steve@apple.com" && password=="infinityLoop1" && loginLocation=="georgia";
        System.out.println(userExist);
    }
}
