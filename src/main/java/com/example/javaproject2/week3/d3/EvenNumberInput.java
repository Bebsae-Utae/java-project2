package com.example.javaproject2.week3.d3;

import java.util.Scanner;

public class EvenNumberInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            System.out.println("짝수를 입력하세요");
            input = sc.nextInt();
        } while (input %2 != 0);
        System.out.println("올바른짝수가 입력되었습니다 : " + input);
    }
}
