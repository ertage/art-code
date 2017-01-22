package week1.day2.student_task;


import java.util.Arrays;

/**
 * Created by gorobec on 22.01.17.
 */
public class Group {
    private String name;
    private Student[] students;
    private int size;

    public Group(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public Student[] addStudent(Student[] students, String name, String surname, int age){
        Student[] newArray = new Student[students.length +1];
        for(int i=0; i<students.length; i++){
            newArray[i] = students[i];
        }
        newArray[newArray.length-1] = new Student(name, surname,age);
        System.out.println("new student in array " + newArray[newArray.length-1].asString());

        return newArray;
    }

//    public void showStudents(){
//
//        for(int i=0; i<students.length; i++){
//            System.out.println(students[i].asString());
//        }
//        System.out.println("Group name - " + name);
//    }

    public String getName() {
        return name;
    }
}
