package com.example.javaproject2.week5.d3;

import java.util.Arrays;

public class Stack1 {
    private int[] arr = new int[10000];
    private int pointer = 0;

   public void push(int value) {
       this.arr[pointer++] = value;
//       System.out.println(Arrays.toString(arr));
//       System.out.println("pointer = " + pointer);
   }

   public boolean isEmpty() {
       return this.pointer == 0;
   }

   public int pop() {
       if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");

       return this.arr[--pointer];
   }
   public int peek(){
       if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");
       return this.arr[pointer-1];
   }
    public static void main(String[] args) {
        Stack1 st = new Stack1();
        System.out.println(st.isEmpty());
        st.push(10);
        System.out.println(st.isEmpty());
        st.push(20);
        System.out.println(st.isEmpty());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        System.out.println(st.peek());
        System.out.println(st.peek());
        st.push(30);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}
