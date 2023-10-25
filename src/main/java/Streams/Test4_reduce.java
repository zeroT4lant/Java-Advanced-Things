package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4_reduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(3);

        //reduce - возвращает optional
        //с методом get возвращает конечное значение аккумулятора (120)
        int res = list.stream().reduce((acc,el) -> acc * el).get();
//        System.out.println(res);
        //5, 4, 2, 1, 3
        //acc - аккумулятор - накапливает в себе значение как переменная суммы в цикле
        //acc = 5 => (5*4)=20 => (20 * 2)=40 => (40 * 1)=40 => (40*3)=120
        //el = 4 2 1 3
        int res2 = list.stream().reduce((acc,el) -> acc * el).get();
        System.out.println(res2);

        //суммирует все элементы листа
        int sum = list.stream().reduce((acc,el) -> acc + el).get();
        System.out.println(sum);

//        List<Integer> list100 = new ArrayList<>();
//        Optional<Integer> o = list100.stream().reduce((acc, el) -> acc * el);
//        //если o - существует
//        if(o.isPresent()){
//            System.out.println(o.get());
//        } else {
//            System.out.println("not present");
//        }

        List<String> list3 = new ArrayList<>();
        list3.add("pawa");
        list3.add("pepa");
        list3.add("gema");
        list3.add("body");

        String stringList = list3.stream().reduce("",(a,e) -> a + " " + e);
        System.out.println(stringList);


        //System.out.println("new sum");
        //новый лист с идентификатором, в таком случае Optional не нужен
        //List<Integer> newList = new ArrayList<>();
        //newList.add(5);
        //newList.add(4);
        //newList.add(2);
        //newList.add(1);
        //newList.add(3);

        //15 - для суммы идентификатор 0, чтобы к нему ничего лишнего не прибавлялось
        //int newSum = newList.stream().reduce(0,(acc,el) -> acc + el);
        //System.out.println(newSum);

        //120 - для умножения идентификатор 1, а не ноль, иначе все остальные станут нулём
        //int newMult = newList.stream().reduce(1,(acc,el) -> acc * el);
        //System.out.println(newMult);
    }
}
