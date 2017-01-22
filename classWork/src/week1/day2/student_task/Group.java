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
            if (students[i].getName().equals(name) &&
                    students[i].getSurname().equals(surname) &&
                    students[i].getAge() == age) {
                students[i] = null;
            }
        }
        return students;
    }

    public void showStudents() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].asString());
            }
        }
        System.out.println("Group name - " + name);
    }

    public boolean findStudent(String name, String surname, int age) {
        Student student = new Student(name, surname, age);
        for (int i = 0; i < students.length; i++) {
            if ((students[i].getName().equals(name) &&
                    students[i].getSurname().equals(surname) &&
                    students[i].getAge() == age)){
                        student = students[i];
                         return true;
            }
        }
        System.out.println(student.asString() + " isn't in this group");
        return false;
    }

    public Student[] sortStudentsByName(){
        int  counter = 0;
        for (int i = 0; i < students.length ; i++) {
            if(students[i] == null ) {
                counter ++;
            }
        }
        Student[] array  = new Student[students.length - counter];
        for (int i = 0; i < students.length ; i++) {
            if(students[i] != null ) {
                array[i] = students[i];
            }
        }
        System.out.println();
        for(int i=0; i<array.length-1; i++){
            int res = array[i].getName().compareTo(array[i + 1].getName());
            if (res > 0) {
                Student tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
            }

            System.out.println(array[i].asString());
        }
        return array;
    }




    public String getName() {
        return name;
    }
}
