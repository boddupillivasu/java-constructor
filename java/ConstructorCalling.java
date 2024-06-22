package com.constructor.java;

public class ConstructorCalling {
    // static block
    static {
        System.out.println("this block contain static");
    }

    public static void main(String[] args) {

        // default constructor declaration

//        StudentInfo student1;
//         student1 = new StudentInfo();

        // no - argument constructor

        StudentInfo student2;
        student2 = new StudentInfo();
        student2.basicInformation();

        StudentInfo student3;
        student3 = new StudentInfo();
        student3.basicInformation();

        // argument constructor

        StudentInfo student4;
        student4 = new StudentInfo("Nishi", "9666462662", "nri", "ece");
        student4.basicInformation();

    }
}
