package com.example.javaproject2.week5.d1;

import java.util.Arrays;

public class BubbleSort02 {

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 1};

        for(int j = 1; j <= arr.length; j++){
            for(int i = 0; i  < arr.length - j; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
                System.out.println(i);
                System.out.println(Arrays.toString(arr));
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
