package com.example.javaproject2.week5.d2;

import java.util.Arrays;

public class SelectionSort01 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        int targetVal = arr[0];
        int targetIdx = 0;
        for (int i = 1; i < arr.length; i++){
            if(targetVal > arr[i]){
                targetVal = arr[i];
                targetIdx = i;
            }
        }

        int temp = arr[0];
        arr[0] = arr[targetIdx];
        arr[targetIdx] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
