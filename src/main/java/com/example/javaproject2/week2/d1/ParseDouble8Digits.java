package com.example.javaproject2.week2.d1;

public class ParseDouble8Digits {
    public static void main(String[] args) {
        String Val1 = "1.11111111";
        String Val2 = "2.11111111";

        float result = Float.parseFloat(Val1) + Float.parseFloat(Val2);
        System.out.println(result);
        double result2 = Double.parseDouble(Val1) + Double.parseDouble(Val2);
        System.out.println(result2);
    }
}
