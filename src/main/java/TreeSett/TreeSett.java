package TreeSett;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TreeSett {
    public static void main(String[] args) {
        //не хранит null
        //отсортированный список
        //ключи - элементы, значения - константа(заглушка)
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(7);

        //нужен компаратор для указания по какому критерию сортируем
        TreeSet<Student> treeSet1 = new TreeSet<>();
        Student s1 = new Student("Misha",5);
        Student s2 = new Student("Kostya",2);
        Student s3 = new Student("Mix",4);
        treeSet1.add(s1);
        treeSet1.add(s2);
        treeSet1.add(s3);
        System.out.println(treeSet1);
        System.out.println(treeSet1.first());
        System.out.println(treeSet1.last());



    }
}

class Student implements Comparable<Student>{
    String name;
    int course;

    public Student(String name, int course) {
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

    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }
}
