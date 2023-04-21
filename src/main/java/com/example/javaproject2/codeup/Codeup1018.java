package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String time = sc.nextLine();
        String[] arr = time.split(":");
        String hour = arr[0];
        String minute = arr[1];

        System.out.printf("%s:%s", hour, minute);
    }
}
