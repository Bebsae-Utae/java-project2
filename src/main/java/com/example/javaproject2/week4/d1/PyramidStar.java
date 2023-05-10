package com.example.javaproject2.week4.d1;

public class PyramidStar {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++){
            for(int j = 0; j < num-i; j ++){
                System.out.printf(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.printf("*");
            }
            for(int j = 0; j < i-1; j++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
