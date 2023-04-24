package com.example.javaproject2.week2.d1;

public class BooleanEx {
    public static void main(String[] args) {
        boolean flag1 = false;
        boolean flag2 = true;

        boolean isPaymentSuccess = true;
        boolean isBalanceSufficient = false;

        boolean result1 = 1 == 1;
        boolean result2 = 1 == 2;
        System.out.println(result1);
        System.out.println(result2);

        int age = 37;
        boolean isAdult = age >= 18;
        System.out.println("isAdult = " + isAdult);

    }
}
