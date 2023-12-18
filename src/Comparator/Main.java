package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "a", 9));
        studentList.add(new Student(2, "c",8));
        studentList.add(new Student(3, "b",10));
        studentList.add(new Student(4, "a", 4));

        // COMPARATOR --> Khoi tao doi tuong comparatorWithStudent
        ComparatorWithStudent comparatorWithStudent = new ComparatorWithStudent();
        Collections.sort(studentList,comparatorWithStudent);
        System.out.println("ListStudent sau khi sap xep-->"+ studentList);

    }
}
