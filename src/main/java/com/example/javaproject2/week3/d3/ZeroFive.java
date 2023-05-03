package com.example.javaproject2.week3.d3;

public class ZeroFive {
    public static boolean isZeroFive(int num){
        while (num > 0) {
            int remainder = num % 10;
            if (remainder % 5 != 0){
                return false;
            }
            num /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 253;
        int cnt = 0;

        // 자릿수 만큼 반복하기
//        while (num > 0) {
//            num /= 10;
//            cnt ++;
//            System.out.printf("num:%d cnt:%d\n", num, cnt);
//        }
        System.out.println(isZeroFive(num));
    }
}
