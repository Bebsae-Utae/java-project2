package com.example.javaproject2.week2.d3;

import java.util.Arrays;

public class DefineArr2 {
    public static void main(String[] args) {
        int iArr[] = new int[]{1,2,3,8};
        System.out.println(iArr[1]);

        int[][] arr32 = new int[3][2];
        int[][] arr67 = new int[6][7];

        int[][] arr2 = new int[][]{{1,2,3},{2,3,4},{1,1,1}};

        System.out.println(Arrays.toString(arr2[1]));
        System.out.println(arr2[1][2]);
    }
}
