package com.risset;

public class Faculty {
    private String teacher;
    private Course[] listCourse = new Course[3];
    private int coutCourse;

    public Faculty(String teacher){
        this.teacher = teacher;
    }

    public String getNameTeacher(){
        return teacher;
    }

    public void teachCourse(Course course){
        listCourse[coutCourse] = course;
        coutCourse++;
    }

    public Course[] getListCourse() {
        return listCourse;
    }

    public int getCoutCourse(){
        return coutCourse;
    }
}
