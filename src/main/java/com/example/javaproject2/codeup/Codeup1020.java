package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String data = sc.next();
        String Forward =  data.substring(0,6);
        String Backward = data.substring(7,14);
        System.out.println(Forward+Backward);

    }


}
