package com.mvn.Has_A_Relatives;

public class School {
    private String schoolName;
    private Student student;

    public School(String schoolName, Student student) {
        this.schoolName = schoolName;
        this.student = student;
    }

    public School() {
        
    }
    void print() {
    System.out.println(this.schoolName);
    System.out.println(this.student.getMarks());
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getSchoolName() {
        return this.schoolName;
    }

    public Student getStudent() {
        return this.student;
    }
}
