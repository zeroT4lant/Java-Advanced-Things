package Generics;


import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        //лист может принимать все объекты
        //с дженериками только один тип
        //в дженерике указываем тип, лист которого хотим создать
        List<String> list = new ArrayList<>();//любой тип у листа
        list.add("Ok");
        list.add("kok");
    }
}
