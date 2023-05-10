package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++){
            for (int j = 0; j < num-i-1; j++){
                System.out.printf(" ");

            }
            for (int z = 0; z < num; z++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}