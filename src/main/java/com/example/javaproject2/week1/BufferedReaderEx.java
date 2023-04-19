package com.example.javaproject2.week1;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BufferedReaderEx {
    public void readALine() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.println(br.readLine());
        System.out.println(br.readLine());

    }
}
