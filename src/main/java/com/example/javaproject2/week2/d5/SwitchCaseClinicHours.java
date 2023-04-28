package com.example.javaproject2.week2.d5;

public class SwitchCaseClinicHours {
    public static void main(String[] args) {
        String day = "mon";
        String time = "pause";

        switch (day) {
            case "mon", "tue", "thu", "fri":
                time = "09:30-18:30";
                break;
            case "sat":
                time = "09:30-13:00";
                break;
            case "wed", "sun":
                time = "pause";
                break;

        }
        System.out.printf("%s요일은 %s입니다.", day, time);
    }
}
