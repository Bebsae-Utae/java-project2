package com.example.javaproject2.week2.d2;

public class StringSplit {
    public static void main(String[] args) {
        String str = "10 3 5 39 12";
        String[] strArr = str.split(" ");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);
        System.out.println(strArr[4]);

    }
}
