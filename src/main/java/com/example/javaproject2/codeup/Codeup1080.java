package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int data = 0;
        int ans = 0;

        for (int i = 1; data < num; i++){
            data += i;
            if (data >= num) {
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
