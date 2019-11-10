package com.wojciech;

/**
 * created by Wojciech 10.11.2019
 * This class is responsible for keeping the track
 * of techers's name, id, salary
 */
public class Teacher {

    private String name;
    private String id;
    private int salary;
    private int salaryEarned;

    /**
     * Create a new teacher object
     * @param name teacher's name
     * @param salary salary of the teacher
     */
    public Teacher(String name, int salary){

        this.name = name;
        salaryEarned = 0;
    }


    public int getSalary() {
        return salary;
    }

    /**
     * Set teacher's salary
     * @param salary new teacher's salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /**
     * adds to the salary
     * adds to total money spent
     * @param salary money paid for school
     */
    public void reciveSallarty(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }
}


