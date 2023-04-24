package com.example.javaproject2.week1;

public class PrintfEx {
    public void print(){
        System.out.printf("%s", "hello");
        System.out.println("bye");
    }

    public static void main(String[] args) {
        PrintfEx printfEx = new PrintfEx();
        printfEx.print();
        printfEx.print();
    }
}
