package com.example.javaproject2.week2.d4;

public class ComparisonOperatorsEx {
    public static void main(String[] args) {
        int iVal1 = 10;
        int iVal2 = 20;
        System.out.printf("%d == %d --> %b\n", iVal1, iVal2, iVal1==iVal2);
        System.out.printf("%d != %d --> %b\n", iVal1, iVal2, iVal1!=iVal2);
        System.out.printf("%d < %d --> %b\n", iVal1, iVal2, iVal1<iVal2);
        System.out.printf("%d <= %d --> %b\n", iVal1, iVal2, iVal1<=iVal2);
        System.out.printf("%d > %d --> %b\n", iVal1, iVal2, iVal1>iVal2);
        System.out.printf("%d >= %d --> %b\n", iVal1, iVal2, iVal1>=iVal2);
    }
}
