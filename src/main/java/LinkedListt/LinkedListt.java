package LinkedListt;

import java.util.LinkedList;

public class LinkedListt {
    //поиск по индексу очень медленный, перебирает каждый элемент, глупый брутфорс
    //вставка и удаления элемента очень быстрая, листу не придётся двигать элементы, в отличии от массива
    public static void main(String[] args) {
        Student1 st1 = new Student1("Kolya",2);
        Student1 st2 = new Student1("Petya",1);
        Student1 st3 = new Student1("Semen",3);
        Student1 st4 = new Student1("Masha",2);
        Student1 st5 = new Student1("Pasha",5);
        LinkedList<Student1> student1LinkedList = new LinkedList<>();
        student1LinkedList.add(st1);
        student1LinkedList.add(st2);
        student1LinkedList.add(st3);
        student1LinkedList.add(st4);
        student1LinkedList.add(st5);

        System.out.println("LinkedList = " + student1LinkedList);

        //добавление и удаление сработает очень быстро, из-за того,
        // что у каждого элемента есть информация о прошлом и предыдщем элементе

        Student1 st6 = new Student1("Igor",228);

        student1LinkedList.add(2,st6);
        System.out.println("LinkedList = " + student1LinkedList);

    }
}

class Student1 {
    private String name;
    private int course;

    public Student1(String name,int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
