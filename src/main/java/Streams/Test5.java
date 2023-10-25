package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {5,4,2,6,8,11,5,44};
//        arr = Arrays.stream(arr).sorted().toArray();
//        System.out.println(Arrays.toString(arr));
        int res = Arrays.stream(arr).filter(e -> e % 2 == 1)
                .map(e -> {if (e%3==0) {e/=3;} return e;})
                .reduce(0,(ac,el) -> ac + el);
        System.out.println(res);
        //5,11,5

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

        //сортируем по возрасту
        //в sorted надо вставить компаратор
        students = students.stream().sorted((s1,s2) -> s1.getAge() - s2.getAge() ).collect(Collectors.toList());
        System.out.println(students);
    }
}
