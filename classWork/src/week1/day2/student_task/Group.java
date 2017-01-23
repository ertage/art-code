package week1.day2.student_task;


import java.util.Arrays;

/**
 * Created by gorobec on 22.01.17.
 */
public class Group {
    private String name;
    private int size;
    private Student[] students;
    private int countStudents = 0;


    public Group(String name, int size) {
        this.name = name;
        this.size = size;
        this.students = new Student[size];
    }

    public Student[] addStudent(String name, String surname, int age) {

        if (countStudents < size) {
            students[countStudents] = new Student(name, surname, age);
        } else {
            System.out.println("Group is full");
        }
        countStudents++;
        return students;
    }

    public Student[] deleteStudent(String name, String surname, int age) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(name) && students[i].getSurname().equals(surname) && students[i].getAge() == (age)) {
                students[i] = null;
                countStudents--;
                break;
            }
        }
        for (int i = 0; i < students.length-1; i++){
            if(students[i] == null){
                students[i] = students[i+1];
                students[i+1] = null;
                break;
            }
            students[i].asString();
        }
        return students;
    }

    public void showStudents() {
        System.out.println("Group name - " + name);
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].asString());
            }
        }

    }

    public boolean findStudent(String name, String surname, int age) {
        for (int i = 0; i < students.length; i++) {
            if ((students[i].getName().equals(name) &&
                    students[i].getSurname().equals(surname) &&
                    students[i].getAge() == age)){
                         return true;
            }
        }
        return false;
    }

    public void sortStudentsByName(){
        for(int i=0; i<countStudents-1; i++){
            int res = students[i].getName().compareTo(students[i + 1].getName());
            if (res > 0) {
                Student tmp = students[i];
                students[i] = students[i + 1];
                students[i + 1] = tmp;
            }
        }

    }




    public String getName() {
        return name;
    }
}
