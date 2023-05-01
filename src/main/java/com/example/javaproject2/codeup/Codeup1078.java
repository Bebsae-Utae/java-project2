package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int data = 0;

        for (int i = 2; i <= num; i += 2){
            data += i;
        }
        System.out.println(data);
    }
}
