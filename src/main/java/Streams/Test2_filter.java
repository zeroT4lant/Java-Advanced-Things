package Streams;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2_filter {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',19,2,3.5);
        Student st2 = new Student("Nika",'f',28,1,4.5);
        Student st3 = new Student("Oleg",'m',219,5,2.5);
        Student st4 = new Student("Masha",'f',59,3,5.5);
        Student st5 = new Student("Petr",'m',20,4,8.65);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        System.out.println(students);

        //filter принимает Predicate
        //привели тип List к ArrayList
        var students2 = (ArrayList<Student>) students.stream().filter(e
                -> e.getAge() > 22 && e.getAvgGrade() > 5)
                .collect(Collectors.toList());
        System.out.println(students2);

        ArrayList<Student> femStudents = (ArrayList<Student>) students.stream().filter(e -> e.getSex() == 'f').collect(Collectors.toList());
        System.out.println(femStudents);

        //есть такой способ создать стрим
        //Stream<Student> myStream = Stream.of(st1,st2,st3,st4,st5);
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
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
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}
