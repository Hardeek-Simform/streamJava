package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        System.out.println("------------------------");
        studentList.add("Yash");
        studentList.add("Mihir");
        studentList.add("Hardeek");
        studentList.add("Rakesh");
        studentList.add("Suresh");
        studentList.add("Mahesh");
        studentList.add("Jayesh");
        studentList.add("Parth");
        studentList.add("Diwakar");
        studentList.add("Shailesh");
        System.out.println("The ArrayList contains total 10 students that are : \n" + studentList);
        List evenLenStudentList = studentList.stream().filter(element -> element.length() % 2 == 0).collect(Collectors.toList());
        System.out.println("------------------------\nThis is how arraylist looks after applying even length filter \n" + evenLenStudentList);
        System.out.println("------------------------");
    }
}