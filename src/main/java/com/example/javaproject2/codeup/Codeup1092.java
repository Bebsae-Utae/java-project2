package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int i = 1;

        while (i % num1 != 0 || i % num2 != 0 || i % num3 != 0)
            i++;
        System.out.println(i);
    }
}
