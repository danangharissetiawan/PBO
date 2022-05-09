package com.risset;

public class Student {
    private String name;
    private Course[] listCourse = new Course[1000];
    private int countCourse;

    public Student(String name) {
        this.name = name;
    }

    public String getNameStudent() {
        return name;
    }

    public void takeCourse(Course course) {
        listCourse[countCourse++] = course;
    }

    public Course[] getListCourse() {
        return listCourse;
    }

    public int getCountCourse() {
        return countCourse;
    }

}