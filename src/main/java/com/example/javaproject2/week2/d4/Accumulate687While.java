package com.example.javaproject2.week2.d4;

public class Accumulate687While {
    public static void main(String[] args) {
        // 변수, 누적, 연산자, 나머지, 몫
        int num = 687;
        int answer = 0;

        while(num>0) {
            // 나머지 먼저 구하고
            answer = answer + (num % 10);
            // 그 후에 몫을 구하기
            num = num / 10;
            // 68을 10으로 나누면 나머지 8

            System.out.printf("num: %d\nanswer: %d\n", num, answer);
        }

    }
}
