package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answ = 0;

        for(int i = 1; i <= num; i++){
            answ++;
            if (answ % 3 == 0){
                continue;
            }
            System.out.println(answ);
        }
    }

}
