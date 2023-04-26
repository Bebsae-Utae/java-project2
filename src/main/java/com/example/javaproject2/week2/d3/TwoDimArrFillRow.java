package com.example.javaproject2.week2.d3;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArrFillRow {

    public static void printArray(int[][] arr){
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));
    }
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        arr[num][0] = 1;
        arr[num][1] = 1;
        arr[num][2] = 1;
        arr[num][3] = 1;
        arr[num][4] = 1;


        printArray(arr);

    }
}
