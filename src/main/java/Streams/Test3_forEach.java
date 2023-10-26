package Streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test3_forEach {
    public static void main(String[] args) {
        int[] arr = {4,2,1,5,3};
        //для работы с массивами нужно импортировать коллекцию Arrays
//        Arrays.stream(arr).forEach(e -> {e*=2;
//            System.out.println(e);});
//        //
//        Arrays.stream(arr).forEach(System.out::println);


        //принимает функцию - консумер, в которую нужно передать параметр
        //---каждый элемент потока помести в myMethod в качестве параметра
        //который находится в классе Utils
        //Arrays.stream(arr).forEach(Utils::myMethod);
        //равно
        Arrays.stream(arr).forEach(e -> Utils.myMethod(e));


    }
}

class Utils{
    public static void myMethod(int a) {
        a+=5;
        System.out.println("Element = " + a);
    }
}
