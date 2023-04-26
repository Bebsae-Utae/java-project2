package com.example.javaproject2.week2.d3;

public class ReferenceTypeVariable {
    public static void main(String[] args) {
        // Student타입 객체명student = new키워드 Student()클래스
        Student student = new Student();      // Student 타입의 객체인 student를 생성


        Student[] students = new Student[2]; // 배열 초기화
        students[0] = new Student();         // Student 클래스 초기화
        students[0].name = "도롱이";
        students[0].phoneNumber = "010-1234-5678";
        students[0].age = 2;
        students[1] = new Student();         // Student 클래스 초기화
        students[1].name = "코코";
        students[1].phoneNumber = "010-2234-5551";
        students[1].age = 2;

        System.out.println(students[0].name);
        System.out.println(students[1].name);

    }
}
