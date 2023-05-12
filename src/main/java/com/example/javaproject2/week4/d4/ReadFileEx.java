package com.example.javaproject2.week4.d4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx {

    LineReader lineReader;

    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();
        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName), StandardCharsets.UTF_8)) {

            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }
    public Hospital parse(String str) {
//        System.out.println(str);
        String[] splitted = str.split(",");
//        System.out.println(Arrays.toString(splitted));
        Address address = new Address(splitted[10], splitted[5], splitted[7]);
        Hospital hospital = new Hospital(splitted[1], splitted[11], address);

        return hospital;

    }

    public List<Hospital> getHospitals(List<String> lines) {
        List<Hospital> hospitals = new ArrayList<>();
        for (String line: lines) {
            hospitals.add(parse(line));
        }
        return hospitals;
    }

    public static void main(String[] args) throws IOException {
        ReadFileEx rfe = new ReadFileEx();
        List<String> stringLines = rfe.getLines("./hospital_info_0920_utf8.csv");
        List<Hospital> parsedHospital = rfe.getHospitals(stringLines);
        for (int i = 0; i < parsedHospital.size(); i++){
            Hospital hospital = parsedHospital.get(i);
            System.out.printf("%s %s %s\n", hospital.getName(), hospital.getWebsiteAddr(), hospital.getAddress().getFullAddr());
        }
    }
}
