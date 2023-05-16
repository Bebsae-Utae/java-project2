package com.example.javaproject2.week5.d2;

import java.util.Arrays;

public class InsertSort02 {

    // desc = 내림차순
    // asc  = 오름차순
    public int[] sort(int[] arr, boolean isAscending) {
        for (int i = 1; i < arr.length; i++){
            for (int j = i; j > 0; j--) {
                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j-1);
                if ((isAscending ? arr[j-1] - arr[j] : arr[j] - arr[j-1] ) > 0){  // 내림차순
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    // 오버로딩
    public int[] sort(int[] arr){
        return sort(arr, true);
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        InsertSort02 is = new InsertSort02();
        arr = is.sort(arr, false); // false는 내림차순, true는 오름차순
        System.out.println(Arrays.toString(arr));
    }

}
