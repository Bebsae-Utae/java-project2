package com.example.javaproject2.week2.d3;

public class ClassInSchoolTest {
    public static void main(String[] args) {
        ClassInSchool classInSchool = new ClassInSchool();
        classInSchool.no = 1;
        classInSchool.teacher = new Teacher();
        classInSchool.teacher.name = "김떡만";
        classInSchool.teacher.age = 5;
        classInSchool.teacher.address = "대구시";
        classInSchool.students = new Student[30];

        System.out.println(classInSchool.teacher.name);
        System.out.printf("%d반 담임 선생님 성함은 %s입니다.", classInSchool.no, classInSchool.teacher.name);
    }
}
