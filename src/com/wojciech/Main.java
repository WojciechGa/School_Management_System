package com.wojciech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        School ghs = new School("GHS");

        Teacher lizzy = new Teacher("Lizzy", 500);
        Teacher mellisa = new Teacher( "Mellisa", 700);
        Teacher ben = new Teacher("Ben", 600);

        Student jon = new Student( "Jon", 5);
        Student lissy = new Student( "Lissy", 4);
        Student ken = new Student( "Ken", 3);

        System.out.println(lizzy);
        ghs.addTeacher(lizzy);
        ghs.addTeacher(mellisa);
        ghs.addTeacher(ben);

        System.out.println(lizzy);
        System.out.println(ben);

        System.out.println(jon);

        ghs.addStudent(jon);
        ghs.addStudent(lissy);
        ghs.addStudent(ken);

        System.out.println(jon);
        System.out.println(lissy);
        System.out.println(ken);


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
