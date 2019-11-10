package com.wojciech;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher ben = new Teacher(3, "Ben", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(ben);

        Student jon = new Student(1, "Jon", 5);
        Student lissy = new Student(2, "Lissy", 4);
        Student ken = new Student(3, "Ken", 3);

        List<Student> studentList = new ArrayList<>();
        studentList.add(jon);
        studentList.add(lissy);
        studentList.add(ken);

        School ghs = new School("GHS", teacherList, studentList);

        lissy.payFee(5000);
        ghs.showFunds();
        jon.payFee(6000);
        ghs.showFunds();

        System.out.println("------Making GHS pay teachers-------");
        lizzy.reciveSallarty(lizzy.getSalary());
        ghs.showFunds();
        ben.reciveSallarty(ben.getSalary());
        ghs.showFunds();
    }
}
