package labda;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {

    //передаём лист студентов и объект реализующий интерфейс StudentChecks
    //вторым аргументом объект типа интерфейса Predicate
    void testStudents(ArrayList<Student> al, Predicate<Student> pr){
        for (Student s : al){
            //если переменная, переданная в аргумент test, проходит проверку, то печатаем число
            if(pr.test(s)){
                System.out.println(s);
            }
        }
    }
}

class Test {
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

        //компоратор вторым параметром
        //сортировка по условию
//        Collections.sort(students, (stud1,stud2) -> {return stud1.age - stud2.age;});
//        System.out.println(students);



        //создаём объект
        StudentInfo info = new StudentInfo();
//        info.testStudents(students, new CheckOverGrade());
        //System.out.println("----");
        //или анонимный класс
        //метод testStudents - перебирает всех студентов
        //в аргументе анонимный класс с переопределённым методом
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age<30;
//            }
//        });

        //фильтрация по условию
        //теперь вторым параметром ждёT Predicate
        info.testStudents(students, s -> s.avgGrade<5);
        System.out.println("----");

        //
        info.testStudents(students, (Student s) -> {return s.age<30;});

        System.out.println("predicate -------");
        Predicate<Student> p1 = student -> {return student.avgGrade > 5;};
        Predicate<Student> p2 = student -> student.sex == 'm';
        //проверка двух условий
        info.testStudents(students,p2.and(p1));

        Function<Student,Double> f = student -> 3.14;

    }
}


//функциональный интерфейс - содержит один абстрактный метод
//из - за того, что он удолетворяет условиям лямбда функции
// и что это единственный метод интерфейса, Java понимает, с каким методом мы работаем


//interface StudentChecks{
//    boolean check(Student s);
//}