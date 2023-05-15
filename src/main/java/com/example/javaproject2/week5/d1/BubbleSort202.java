package com.example.javaproject2.week5.d1;

import java.util.Arrays;

public class BubbleSort202 {
    public int[] sort(int[] arr){
        for(int i = 0; i < arr.length -1; i++){
            for (int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort202 bubblesort202 = new BubbleSort202();
        int[] arr = {7, 2, 3, 9, 28, 1};
        arr = bubblesort202.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
