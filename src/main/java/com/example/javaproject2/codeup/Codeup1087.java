package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answ = 0;

        for (int i = 1; i <= num; i++){
            answ += i;
            if (answ >= num) {
                break;
            }
        }
        System.out.println(answ);
    }
}
