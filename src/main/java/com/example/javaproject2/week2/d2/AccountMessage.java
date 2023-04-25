package com.example.javaproject2.week2.d2;

public class AccountMessage {
    public static void main(String[] args) {
        String name = "김떡만";
        int balance = 2_000_000;
        String message = name + "님의 통장잔고는 " + balance + "원입니다.";
        System.out.println(message);
    }
}
