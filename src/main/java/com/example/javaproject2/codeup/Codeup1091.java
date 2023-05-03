package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long m = sc.nextLong();
        long d = sc.nextLong();
        long n = sc.nextLong();

        long answ = a;

        for (int i = 1; i < n; i++){
            answ *= m;
            answ += d;
        }
        System.out.println(answ);
    }
}
