package com.wojciech;

/**
 * This class is responsible for keeping track of students
 * their names, fees ect
 *
 */
public class Student {

    private int ID;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     *
     * @param id is for the student unique
     * @param name name of student
     * @param grade grade of student
     */

    public Student(int id, String name, int grade){
        setID(id);
        setName(name);
        setGrade(grade);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(int feesPaid) {
        this.feesPaid = feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public void setFeesTotal(int feesTotal) {
        this.feesTotal = feesTotal;
    }
}
