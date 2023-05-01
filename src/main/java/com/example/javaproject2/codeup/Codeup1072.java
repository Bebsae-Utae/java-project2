package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lengths = sc.nextInt();
        int[] arr;
        arr = new int[lengths];

        for(int i = 0; i < lengths; i++) {
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }
    }
}
