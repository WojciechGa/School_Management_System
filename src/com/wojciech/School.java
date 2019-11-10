package com.wojciech;

import java.util.List;

/**
 * School may have multiple students and teachers
 * Implements teachers and students using ArrayList
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * new school created
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneySpent = 0;
        totalMoneyEarned = 0;
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
    public void addTeachers(Teacher teacher) {
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
    public void addStudents(Student student) {
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
    public void updateTotalMoneyEarned(int moneyEarned) {
        this.totalMoneyEarned += moneyEarned;
    }

    /**
     *
     * @return the total money spent by school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money spent by the school wich is
     * only by salary given to
     * @param moneySpent the money
     */
    public void updateTotalMoneySpent(int moneySpent) {
        this.totalMoneySpent += moneySpent;
    }
}
