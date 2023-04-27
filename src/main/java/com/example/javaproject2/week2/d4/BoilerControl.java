package com.example.javaproject2.week2.d4;

public class BoilerControl {
    public static void main(String[] args) {
        int waterTemp = 45;
        int roomTemp = 22;

        boolean check = waterTemp < 50 && roomTemp < 24;
        System.out.printf("check: %b\n", check);
    }
}
