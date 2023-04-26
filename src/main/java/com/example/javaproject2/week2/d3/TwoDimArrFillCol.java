package com.example.javaproject2.week2.d3;

import java.util.Arrays;
import java.util.Scanner;

    public class TwoDimArrFillCol {

        public static void printArray(int[][] arr){
            System.out.println(Arrays.toString(arr[0]));
            System.out.println(Arrays.toString(arr[1]));
            System.out.println(Arrays.toString(arr[2]));
            System.out.println(Arrays.toString(arr[3]));
            System.out.println(Arrays.toString(arr[4]));
        }

        public static void fillACol(int[][] arr, int colNum) {
            arr[0][colNum] = 1;
            arr[1][colNum] = 1;
            arr[2][colNum] = 1;
            arr[3][colNum] = 1;
            arr[4][colNum] = 1;
        }
        public static void main(String[] args) {
            int[][] arr = new int[5][5];

            Scanner sc = new Scanner(System.in);
            int colNum = sc.nextInt();

            fillACol(arr, colNum);
            printArray(arr);

        }
    }