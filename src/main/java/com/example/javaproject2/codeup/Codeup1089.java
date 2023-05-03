package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int answ = num1;

        for (int i = 1; i < num3; i++){
            answ += num2;
        }
        System.out.println(answ);
    }
}
