package com.risset;

public class Course {
    private String nameCourse;
    private Student listStudent[] = new Student[60];
    private int countStudent;
    private Faculty listFaculty[] = new Faculty[3];
    private int countFaculty;

    public Course(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void addStudent(Student student) {
        listStudent[countStudent] = student;
        countStudent++;
    }

    public Student[] getStudent() {
        return listStudent;
    }

    public int getCountStudent() {
        return countStudent;
    }

    public void setFaculty(Faculty faculty){
        listFaculty[countFaculty] = faculty;
        countFaculty++;
    }

    public Faculty[] getListFaculty() {
        return listFaculty;
    }

    public int getCountFaculty() {
        return countFaculty;
    }

    public void printStudent(){
        for(int i = 0; i < countStudent; i++){
            System.out.print(listStudent[i].getNameStudent()+ ", ");
        }
    }

    public void printTeacher(){
        for(int i = 0; i < countFaculty; i++){
            System.out.print(listFaculty[i].getNameTeacher() + ", ");
        }
    }

    public static void main(String[] args) {
        Course pbo = new Course("PBO");
        Course web = new Course("Web");

        pbo.setFaculty(new Faculty("Nurul Anisa"));
        pbo.setFaculty(new Faculty("Nurul Fadilah"));
        web.setFaculty(new Faculty("Sandika Galih"));

        pbo.addStudent(new Student("Danang Haris Setiawan"));
        pbo.addStudent(new Student("Rizki Setiawan"));
        web.addStudent(new Student("Hilman Fakih"));
        web.addStudent(new Student("Usman Fadilah"));

        // print
        System.out.println("====== Matkul UDINUS ======");
        System.out.println("1. PBO");
        System.out.print("Dosen: ");
        pbo.printTeacher();
        System.out.print("\nMurid ada " + pbo.getCountStudent() + " :");
        pbo.printStudent();

        System.out.println("\n2. Web");
        System.out.print("Dosen: ");
        web.printTeacher();
        System.out.print("\nMurid ada " + web.getCountStudent() + " :");
        web.printStudent();
    }
}
