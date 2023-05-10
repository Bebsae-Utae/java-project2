package com.example.javaproject2.week4.d3;

public class DrawDiamonds2 {
    public static String getRepeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }

    public static void main(String[] args) {
        int h = 7;
        int p = h/2;
        for (int i = 0; i < h; i ++){
            if (i <= p) {
                System.out.printf("%s%s\n", getRepeatedSymbol("0", -2 + h - i - 2), getRepeatedSymbol("*", 2 * i + 1));
            } else {
                System.out.printf("%s%s\n", getRepeatedSymbol("0", i - p), getRepeatedSymbol("*", 2 * (h-i) - 1));
            }
        }
    }
}
