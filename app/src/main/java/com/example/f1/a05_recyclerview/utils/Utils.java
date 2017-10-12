package com.example.f1.a05_recyclerview.utils;

import com.example.f1.a05_recyclerview.model.Student;

import java.util.ArrayList;

/**
 * Utils class. Here will be the methods to fill list of students.
 */

public class Utils {

    // Students names:
    private static String[] NAMES = {"Student 1", "Student 2", "Student 3", "Student 4", "Student 5",
            "Student 6", "Student 7", "Student 8", "Student 9", "Student 10",
            "Student 11", "Student 12", "Student 13", "Student 14", "Student 15",
            "Student 16", "Student 17", "Student 18", "Student 19", "Student 20", };

    //Students ages:
    private static int[] NUMBERS = {31, 23, 56, 54, 76, 34, 22, 21, 34, 21,
            22, 21, 33, 21, 22, 16, 17, 34, 23, 20};

    static public ArrayList<Student> fillListOfStudents() {
        ArrayList<Student> arrayList = new ArrayList<>();
        for (int i=0; i<=19; i++) {
            Student aStudent = new Student(NAMES[i], NUMBERS[i]);
            arrayList.add(aStudent);
        }
        return arrayList;
    }

}