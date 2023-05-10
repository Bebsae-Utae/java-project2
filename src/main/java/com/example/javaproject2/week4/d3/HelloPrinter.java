package com.example.javaproject2.week4.d3;

import java.io.IOException;

public class HelloPrinter {

    Printer2 printer;

    public HelloPrinter(Printer2 printer) {
        this.printer = printer;
    }

    public void repeatMessage(int n, String message) throws IOException {
        for(int i = 0; i < n; i++)
        {
            printer.print(message);
        }
    }

    public static void main(String[] args) throws IOException {
        HelloPrinter hp = new HelloPrinter(new FilePrinter());       // 인스턴스 생성
        hp.repeatMessage(3, "Hello");    // 호출

    }
}
