package com.example.javaproject2.week3.d3;

public class Factor2 {
    public static void main(String[] args) {
        int n = 36;
        for (int i = 1; i <= 36; i++){
            if (n % i == 0){
                System.out.printf("%d -> 36의 약수 : %d\n", n % i, i);
            }
        }
    }
}
