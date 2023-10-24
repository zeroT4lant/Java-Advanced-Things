package Iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class Itterator {
    public static void main(String[] args) {
        ArrayList<String> arrList1 = new ArrayList<>();//с типом String
        arrList1.add("Zaur");
        arrList1.add("Semen");
        arrList1.add("Andrew");
        System.out.println("arrList1 = "+arrList1);

        //указываем в дженерике тип итератора
        Iterator<String> iterator = arrList1.iterator();//делаем arrList1 способным к итератору
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
