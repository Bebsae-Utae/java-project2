package com.example.javaproject2.week2.d3;

public class Accumulate687 {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;
        answer = answer + num % 10;
        System.out.println(answer);
        num = num / 10;

        answer = answer + num % 10;
        System.out.println(answer);
        num = num / 10;

        answer = answer + num % 10;
        System.out.println(answer);
    }
}
