package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b){
            System.out.println(1);
        }
        if (a<=b){
            System.out.println(0);
        }
    }
}
