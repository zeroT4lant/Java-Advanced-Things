package TreeMapp;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Objects;
import java.util.TreeMap;

public class TreeMapp {
    public static void main(String[] args) {
        //сортирует по ключу элементы
        //быстрая структура данных, но не быстрее HashMap
        //могут быть одинаковые значения, в случае одинаковых ключей элемент встаёт на место прежнего
        TreeMap<Double,Student1> treeMap = new TreeMap<>();
        Student1 s1 = new Student1("Egor","Gribov",2);
        Student1 s2 = new Student1("Babun","Gribov",3);
        Student1 s3 = new Student1("Kozel","Gribov",5);
        Student1 s4 = new Student1("Egor","Gribov",1);
        Student1 s5 = new Student1("Ilya","Smirnov",7);
        Student1 s6 = new Student1("Ilya","Smir",6);
        Student1 s7 = new Student1("Maxsos","Grishin",4);
        treeMap.put(7.6,s1);
        treeMap.put(7.1,s2);
        treeMap.put(5.6,s3);
        treeMap.put(3.6,s4);
        treeMap.put(6.2,s5);
        treeMap.put(7.23,s6);
        treeMap.put(9.6,s7);

        //сортирует по ключу элементы
        System.out.println(treeMap);

        //переворачивает порядок элементов, теперь ключи по убыванию
        System.out.println(treeMap.descendingMap());

        //вывод элементов от указанного значения ключа
        //значение в аргументе включено в поиск
//        System.out.println(treeMap.tailMap(5.3));

        //вывод элементов до указанного значения ключа
        //значение в аргументе не включено в поиск
//        System.out.println(treeMap.headMap(5.3));

        //первый студент
        System.out.println(treeMap.firstEntry());

        //последний студент
        System.out.println(treeMap.lastEntry());

        //поменяли compareTo, теперь сортировка по курсам
//        System.out.println(treeMap);

        //идёт поиск по значению, элемент ещё не добавили в дерево, но с такими данными нашлось
        //поиск по compareTo
//        Student1 s8 = new Student1("Maxsos","Grishin",4);
//        System.out.println(treeMap.containsKey(s8));

    }
}

class Student1 implements Comparable<Student1>{
    String name;
    String surname;
    int course;

    public Student1(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return course == student1.course && Objects.equals(name, student1.name) && Objects.equals(surname, student1.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }


    @Override
    public int compareTo(Student1 o1) {//изменили стандартную сортировку
        return this.course - o1.course;
    }
}
