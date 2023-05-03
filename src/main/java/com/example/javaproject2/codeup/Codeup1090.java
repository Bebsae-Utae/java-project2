package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        long num3 = sc.nextLong();
        long answ = num1;

        for (int i = 1; i < num3; i++){
            answ *= num2;
        }
        System.out.println(answ);
    }
}
