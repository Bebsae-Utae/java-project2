package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int data1 = sc.nextInt();
        int data2 = sc.nextInt();

        if (data1 == 0 && data2 == 0){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
