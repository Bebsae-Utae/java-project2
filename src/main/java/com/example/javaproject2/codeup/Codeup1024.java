package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        int len = data.length();

        for(int i =0; i<len; i++){
            System.out.printf("\'%c\'\n", data.charAt(i));

        }


    }
}
