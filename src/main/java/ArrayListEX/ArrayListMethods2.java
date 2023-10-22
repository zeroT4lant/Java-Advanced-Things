package ArrayListEX;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan","m",18,2,3.5);
        Student s2 = new Student("Cheban","m",18,2,3.5);
        Student s3 = new Student("Den","m",18,2,3.5);
        Student s4 = new Student("Buben","m",18,2,3.5);
        Student s5 = new Student("Gosha","m",18,2,3.5);
        ArrayList<Student> studList = new ArrayList<>();
        studList.add(s1);
        studList.add(s2);
        studList.add(s3);
        studList.add(s4);
        studList.add(s5);
        System.out.println(studList.toString());
        studList.remove(s5);
        System.out.println(studList.toString());
    }
}

class Student {
    private String name;
    private String sex;
    private int age;
    private int course;
    private Double avgGrade;

    public Student(String name, String sex, int age, int course, Double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

}
