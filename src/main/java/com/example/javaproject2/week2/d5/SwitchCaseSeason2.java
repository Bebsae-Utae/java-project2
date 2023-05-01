package com.example.javaproject2.week2.d5;

public class SwitchCaseSeason2 {
    public static void main(String[] args) {
        int month = 3;
        switch (month) {
            case 12, 1, 2:
                System.out.println("winter");
                break;
            case 3, 4, 5:
                System.out.println("sprint");
                break;
            case 6, 7, 8:
                System.out.println("summer");
                break;
            case 9, 10, 11:
                System.out.println("fall");
                break;
        }
    }
}
