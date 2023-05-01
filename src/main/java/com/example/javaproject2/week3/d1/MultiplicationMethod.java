package com.example.javaproject2.week3.d1;

public class MultiplicationMethod {
    public static void printDan(int dan) {
        for (int i = 1; i <= 9; i++){
            System.out.println(i * dan);
        }
    }

    public static void main(String[] args) {
        printDan(2);
    }

}
