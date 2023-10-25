package Streams;


import java.util.*;
import java.util.stream.Collectors;


//Методы stream не меняют саму коллекцию или массив, от которой поток был создан
public class Test1_map {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela");
        list.add("popa");
        list.add("ok");
        System.out.println(list);
        //поменять строку на количество символов в ней
//        for (int i = 0; i < list.size(); i++) {
//            list.set(i,String.valueOf(list.get(i).length()));
//        }

        // 6 8 4 2 теперь
        //только потоки, не меняет сам лист
        //collect собирает поток в лист обратно
        List<Integer> list2 = list.stream().map(e -> e.length())
                .collect(Collectors.toList());
        System.out.println(list2);

        int[] arr = {4, 2, 3, 5, 1};
        int[] newIntArr = Arrays.stream(arr).map(e
                -> {
            if (e % 2 == 0) {
                e = e * 10;
            }
            return e;
        }).toArray();
        System.out.println(Arrays.toString(newIntArr));

        //TreeSet и так отсортирован
        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela");
        set.add("popa");
        set.add("ok");
        System.out.println(set);

        Set<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        List<Integer> list3 = set.stream().map(e -> e.length()).collect(Collectors.toList());
        System.out.println(set2);
        System.out.println(list3);
    }
}
