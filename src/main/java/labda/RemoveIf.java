package labda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

//removeIf - для фильтрации, в лямбде указываем по какому условию
//Collections.sort - для сортировки (указываем с лямбдой как сортировать будем)


public class RemoveIf {
    //Predicate - используется методом removeIf
    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(5);
        arr1.add(4);
        arr1.add(3);
        arr1.add(2);
        System.out.println("Before");
        System.out.println(arr1);
        System.out.println("-------");
        //вывод по критерию i>2
        arr1.removeIf(integer -> integer > 2);
        System.out.print("arr 1 = ");
        System.out.println(arr1);
        System.out.println("After");

        //в Predicate - есть метод тест, выводит числа, подходящие по условию
        testInts(arr1, integer -> integer>2);

        System.out.println("New test");
        arr1.removeIf(i -> i > 3);
        System.out.println(arr1);//отсортировали

        //reverse
        //вторым параметром компаратор, передаём его лямбдой
        //или такая сортировка, все числа наоборот теперь
        Collections.sort(arr1, (i1,i2) -> i2 - i1);
        System.out.println(arr1);


        List<String> arr = new ArrayList<>();
        arr.add("pawaa");
        arr.add("pepa");
        arr.add("gemaa");
        arr.add("bodi");
        // удаляет подходящие под условие
        arr.removeIf( s -> s.length() > 4);
        //или так
        //Predicate<String> p = el -> el.length() > 4;
        System.out.println(arr);
    }

    //в Predicate - есть метод тест, выводит числа, подходящие по условию
    static void testInts(List<Integer> intArr, Predicate<Integer> pr){
        for (int i : intArr){
            if (pr.test(i)){//если подходит по условию
                System.out.println(i);
            }
        }
    }
}
