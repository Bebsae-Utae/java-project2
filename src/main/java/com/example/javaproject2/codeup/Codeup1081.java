package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        for (int i = 1; i <= dice1; i++){
            for (int j = 1; j <= dice2; j++){
                System.out.printf("%d %d\n", i, j);
            }
        }
    }
}
