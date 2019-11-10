package com.wojciech;

/**
 * created by Wojciech 10.11.2019
 * This class is responsible for keeping the track
 * of techers's name, id, salary
 */
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Create a new teacher object
     * @param id id for a teacher
     * @param name teacher's name
     * @param salary salary of the teacher
     */
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        setSalary(salary);
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

    public int getId() {
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


