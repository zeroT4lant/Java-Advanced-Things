package Generics;

import java.util.ArrayList;
import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        //не позволит добавить в лист с типом WildCard(так как неопределён)
        //не получиться использовать методы, меняющие объект
        List<?> list = new ArrayList<String>();


        List<? extends Number> listSuperInt = new ArrayList<Integer>();

        List<Integer> l1 = new ArrayList<>();

        l1.add(1);
        l1.add(5);
        l1.add(7);
        l1.add(8);
        check1(l1);

        List<Animal> a1 = new ArrayList<>();
        a1.add(new Animal());
        a1.add(new Cat());
        check2(a1);

        List<Double> ald = new ArrayList<>();
        ald.add(3.14);
        ald.add(2.12);
        ald.add(23.51);
        System.out.println(findSum(ald));
    }

    //принимает лист с любыми типами
    //в данном случае выводи все
    public static void check1(List<?> list){
        for (int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }

    //принимает любые типы, наследованные от класса Animal
    //либо сам класс Animal
    public static void check2 (List<? extends Animal> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }


    //принимает родителей и последующие классы
    public static void check3 (List<? super Animal> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }


    //складывает любые числа
    //принимает в параметр лист любого типа - расширяющего тип Number
    public static double findSum(List<? extends Number> list){
        double sum = 0;
        for (Number n : list){
            sum += n.doubleValue();
        }
        return sum;
    }
}

class Animal{

}

class Cat extends Animal{

}

class Bacteria {

}
