package Generics;

import java.util.ArrayList;

public class ParametrerizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(5);

        //возвращает элемент второго индекса
        //в аргумент лист опредлённого типа попадает
        int a = GenMethod.getSecondElement(list1);
        System.out.println(a);//work
    }
}

class GenMethod{

    //ArrayList какого-то типа
    public static <T> T getSecondElement(ArrayList<T> al){
        return al.get(1);//возвращает элемент второго индекса
    }
}
