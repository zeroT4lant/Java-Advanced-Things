package SettAndHashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSett {
    public static void main(String[] args) {
        HashSet<Integer> hashset = new HashSet<>();
        hashset.add(12);
        hashset.add(5);
        hashset.add(3);
        hashset.add(2);
        hashset.add(4);

        HashSet<Integer> hashset2 = new HashSet<>();
        hashset2.add(10);
        hashset2.add(5);
        hashset2.add(8);
        hashset2.add(6);
        hashset2.add(4);

        HashSet<Integer> union = new HashSet<>(hashset);//копируем массив по значениям
        //отстортирован и содержит все элементы, не повторяясь
        union.addAll(hashset2);//объединение
        System.out.println(union);

        HashSet<Integer> intersect = new HashSet<>(hashset);
        intersect.retainAll(hashset2);//пересечения
        System.out.println(intersect);

        HashSet<Integer> subtract = new HashSet<>(hashset);
        subtract.removeAll(hashset2);
        System.out.println(subtract);//есть в первом, но нет во втором
    }
}
