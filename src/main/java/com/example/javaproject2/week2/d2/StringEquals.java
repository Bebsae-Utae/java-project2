package com.example.javaproject2.week2.d2;

public class StringEquals {
    public static void main(String[] args) {
        System.out.println("GOLD" == "GOLD");

        String str1 = "GOLD";
        String str2 = "G";

        boolean isSame = str1.substring(0,1) == str2;
        System.out.println(isSame);

        System.out.println("GOLD-->" + str1.hashCode());
        System.out.println("G----->" + str2.hashCode());
    }
}
