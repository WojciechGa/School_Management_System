package com.wojciech;

/**
 * This class is responsible for keeping track of students
 * their names, fees ect
 *
 */
public class Student {

    private String ID;
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

    public Student(String name, int grade){
        this.name = name;
        setGrade(grade);
        feesPaid = 0;
        setFeesTotal(30000);
    }

    //Not going to alter student ID and students's name can be corrected

    public String getID() {
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
    public void payFee(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(fees);

    }

    public void setID(Integer ID) {
        this.ID = "ST" + ID.toString();
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public void setFeesTotal(int feesTotal) {
        this.feesTotal = feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return String.format("Student name: %s\nStudent Id: %s",name, getID());
    }
}
