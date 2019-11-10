package com.wojciech;

import java.util.ArrayList;
import java.util.List;

/**
 * School may have multiple students and teachers
 * Implements teachers and students using ArrayList
 */
public class School {

    private String name;
    private List<Teacher> teachers = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private static int totalMoneyEarned;
    private static int totalMoneySpent;
    private static int teachersId;
    private static int studentsId;

    /**
     * new school created
     * @param name name of the school
     */
    public School(String name) {
        this.name = name;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
        teachersId = 1;
        studentsId = 1;
    }

    /**
     *
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * add new teacher to the school
     * @param teacher new teacher to be added
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return the list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * adds a student to a school
     * @param student the student to be added
     */
    public void addStudent(Student student) {
        student.setID(studentsId++);
        students.add(student);
    }

    /**
     *
     * @return the total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds new earned maney to total money earned
     * @param moneyEarned money to add
     */
    public static void updateTotalMoneyEarned(int moneyEarned) {

        totalMoneyEarned += moneyEarned;
    }

    /**
     *
     * @return the total money spent by school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money spent by the school which is
     * only by salary given to
     * @param moneySpent the money
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent += moneySpent;
    }

    //showing school's funds
    public void showFunds(){
        System.out.println(getName() + " has earned " + getTotalMoneyEarned() + " $");
        System.out.println(getName() + " has spent " + getTotalMoneySpent() + " $");
    }

    //getting school's name
    public String getName() {
        return name;
    }


}
