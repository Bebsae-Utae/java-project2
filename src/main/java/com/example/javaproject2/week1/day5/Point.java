package com.example.javaproject2.week1.day5;

public class Point {
    public int x;
    public int y;

    boolean isSameXy() {
        return x==y;
    }

    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p.x);
    }
}
