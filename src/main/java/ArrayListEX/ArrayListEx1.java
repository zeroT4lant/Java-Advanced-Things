package ArrayListEX;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        //у листа тип стринг, указываем дженериком
        ArrayList<String> arrList1 = new ArrayList<>();//с типом String
        arrList1.add("Zaur");
        arrList1.add("Semen");
        arrList1.add("Andrew");
        System.out.println("arrList1 = "+arrList1);
        System.out.println(arrList1.indexOf("Semen"));//найти индекс такого значения
        System.out.println(arrList1.contains("Andrew"));//возвращает bool
        //////////////

        //массив объектов
        ArrayList arrList2 = new ArrayList();// без типа, добавляем любые типы
        System.out.println(arrList2.getClass());
        arrList2.add(2);
        arrList2.add("aboba");
        System.out.println("arrList2 = "+arrList2);


        ArrayList<String> arrList3 = new ArrayList<>(arrList1);//копия только значений первого листа
        System.out.println(arrList3);
        System.out.println(arrList1==arrList3);//false т.к сравниваем по ссылкам
    }
}
