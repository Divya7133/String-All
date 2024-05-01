package com.mvn.Has_A_Relatives;

public class App {
    public static void main(String[] args) {
        Marks m = new Marks(101, 102, 103);
        Student S1= new Student("divya", "btech", m);
        S1.print();
        School s = new School("tsrs", S1);
        s.print();

       
    }
}
