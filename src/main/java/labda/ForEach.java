package labda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//проделываем операции пробегая по всему списку
//чаще используется для вывода всех элементов
public class ForEach {
    //Consumer используется методом forEach
    public static void main(String[] args) {
        List<String> list = List.of("privet","zdarova","ky");
        for (String s : list){
            System.out.println(s);
        }
        //метод принимает в себя интерфейс-Consumer(потребитель)
        //при помощи forEach меняет каждый элемент, принимая лямбда-функцию
        list.forEach( s -> System.out.println(s));

        List<Integer> intArr = new ArrayList<>();
        intArr.add(1);
        intArr.add(4);
        intArr.add(3);
        intArr.add(5);
        intArr.add(2);
        System.out.println(intArr);


        //сортируем по убыванию через интерфейс Comparator
        Collections.sort(intArr,(i1,i2) -> i2 - i1);
        System.out.println(intArr);
        intArr.forEach(i -> System.out.println(i * 2));

//        Collections.sort(arr1, (i1,i2) -> i2 - i1);
//        System.out.println(arr1);
    }
}
