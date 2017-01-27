package week1.day2.student_task;

/**
 * Created by gorobec on 21.01.17.
 */
public class Student implements Comparable{
    private String name;
    private String surname;
    private int age;
    private double averageMark;


    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
//        validation
        if (name == null || name.isEmpty()) return;
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Student)) return false;
        Student tmp = (Student) obj;
        return (this.name.equals(tmp.name) && (this.surname.equals(tmp.surname)) && (this.age == tmp.age)) ;

    }

    @Override
    public String toString() {
        return String.format("Student name - %s, age - %d", name, age);
    }

    @Override
    public  int compareTo(Object obj){
        Student tmp = (Student) obj;
        int result = this.name.compareTo(tmp.name);
        if(result != 0){
            return  result;
        }
        return  0;
    }
}
