package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1071_dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int num;

        do{
            num = sc.nextInt();
            System.out.println(num);
        }while(num != 0);
    }
}
