package BinSearch;

import java.util.ArrayList;
import java.util.Collections;

public class bbinarySearch {
    public static void main(String[] args) {
        //не отсортирован
        ArrayList<Integer> arrList = new ArrayList<>();
        int[] ints = {4,1,6,2,8,-10,5,192,-100};

        //перебираем все элементы ints
//        for (int e : ints){
//            arrList.add(e);
//        }
        //или
        for (int i = 0; i < ints.length; i++) {
            arrList.add(ints[i]);
        }

        System.out.println("Before sort: " + arrList);

        //сортировка - скорее всего быстрая
        Collections.sort(arrList);
        System.out.println("After sort: " + arrList);

        //поиск индекса по значению
        int index1 = Collections.binarySearch(arrList,-10);
        System.out.println(index1);
    }

}
