package com.example.javaproject2.week2.d5;

public class SwitchCaseEx {
    public static void main(String[] args) {
        int dayOfWeek = 4;
        switch(dayOfWeek) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            default:
                System.out.println("해당하는 요일 없음");
        }
    }
}
