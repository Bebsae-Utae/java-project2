package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nOct = sc.next();

        int nOct2 = Integer.parseInt(nOct, 8);
        System.out.printf("%d", nOct2);
    }
}
