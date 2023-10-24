package HashCodeEx1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        //только уникальные значения
        HashMap<Student,Double> map = new HashMap<>();
        Student s1 = new Student("Egor","Gribov",2);
        Student s2 = new Student("Babun","Gribov",2);
        Student s3 = new Student("Kozel","Gribov",2);
        map.put(s1, 7.6);
        map.put(s2, 5.6);
        map.put(s3, 3.5);
        System.out.println(map);

        Student s4 = new Student("Egor","Gribov",2);
        Student s5 = new Student("Ilya","Smirnov",2);


        //!!!- Чтобы нормально поиск работал - реализуй equals и hashCode
        //true - если реализован метод hashCode, ищет по значению
        System.out.println("Поиск по значению при реализации equals и hashCode");
        System.out.println(map.containsKey(s4));//false,так как поиск по хэшу, а не сравнение

        //
        System.out.println(s1.equals(s4));//true сравнение по значению

        //Сравнение хэшей они одинаковы при реализации HashCode
        System.out.println(s1.hashCode());
        System.out.println(s4.hashCode());

        //в случае если для объектов переопредленны equals и hashCode
        //1) если у двух объектов равны hashCode, то они equals
        //2) если два объекта equals, то у них одинаковый hashCode
        //3) hashCode - работает быстрее, так как сравнивает числа
        //в дефолтной реализации hashCode учитывает ссылку при сравнении

        //если у объектов равны хэшкоды, то их equals == true
        System.out.println("Проверка на хэши и equals: ");
        //с переопределением сравнивает нормально по значениям объектов
        System.out.println(s1.hashCode());
        System.out.println(s4.hashCode());
        System.out.println("Из этого следует...");
        //s1 == s4
        System.out.println(s1.equals(s4));
        // без определённого equals идёт сравнение по ссылке
        // с определённым equals идёт сравнение по значению

        for (Map.Entry<Student,Double> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}

class Student{
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
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
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}