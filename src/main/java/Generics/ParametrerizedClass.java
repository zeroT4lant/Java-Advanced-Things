package Generics;

import java.util.ArrayList;

public class ParametrerizedClass {
    public static void main(String[] args) {
        //гибко подставляем типы в дженерик
        Info<String> info1 = new Info<>("piter");
        System.out.println(info1);


        //указываем какого типа будет объект класса
        Info<Integer> info2 = new Info<>(123);
        System.out.println(info2);

        String s1 = info1.getValue();
        Integer s2 = info2.getValue();
    }
}

class Info <T> {
    private T value;//тип Т передаём из параметра

    public Info(T value) {//тип Т передаём из параметра
        this.value = value;
    }

    public T getValue(){//возвращает значение того же типа
        return value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }
}
