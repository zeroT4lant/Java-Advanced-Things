package Streams;


import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',19,2,3.5);
        Student st2 = new Student("Nika",'f',28,1,4.5);
        Student st3 = new Student("Oleg",'m',219,5,2.5);
        Student st4 = new Student("Masha",'f',59,3,5.5);
        Student st5 = new Student("Petr",'m',20,4,8.65);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        //limit промежуточный метод, ограничивает количество значений
        students.stream().filter(e -> e.getAge() > 20).limit(2).forEach(System.out::println);

        //skip промежуточный метод, пропускает подходящие под условие элементы

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Mathematics");
        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        //для доступа к элементам элементов
        //для каждой коллекции создаём свой стрим
        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .forEach(e -> System.out.println(e.getName()));


        //groupingBy - собирает по группам стримы
        //partitiongBy - делит на две части, либо true, либо false

        //findFirst,min,max - результирующий метод
        //
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(1);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        int min = list1.stream().min((x,y) -> x - y).get();
        System.out.println(min);

        int max = list1.stream().max((x,y) -> x - y).get();
        System.out.println(max);
    }
}

class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty(Student st){
        studentsOnFaculty.add(st);
    }
}
