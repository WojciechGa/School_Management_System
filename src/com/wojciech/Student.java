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
     *Tc create a new student by initilizing
     * Fees for every student is $30.0000
     * Fees paid initially is 0
     * @param id is for the student unique
     * @param name name of student
     * @param grade grade of student
     */

    public Student(int id, String name, int grade){
        this.ID  = id;
        this.name = name;
        setGrade(grade);
        feesPaid = 0;
        setFeesTotal(30000);
    }

    //Not going to alter student ID and students's name can be corrected

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    /**
     * used to correct students name if it was wrong
     * @param name correct name
     */
    public void correctName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    /**
     * used to upgrade student's grade
     * @param grade new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     * used to update paid fees paid
     * add fees to feesPaid
     * the school is going to receive the funds
     * @param fees the fees that the student pays
     */
    public void updateFeesPaid(int fees) {
        feesPaid = feesPaid + fees;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public void setFeesTotal(int feesTotal) {
        this.feesTotal = feesTotal;
    }
}
