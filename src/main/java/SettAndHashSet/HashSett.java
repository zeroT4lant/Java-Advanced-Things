package SettAndHashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSett {
    public static void main(String[] args) {
        HashSet<Integer> hashset = new HashSet<>();
        hashset.add(1);
        hashset.add(5);
        hashset.add(3);
        hashset.add(2);
        hashset.add(4);

        HashSet<Integer> hashset2 = new HashSet<>();
        hashset2.add(1);
        hashset2.add(5);
        hashset2.add(8);
        hashset2.add(6);
        hashset2.add(4);

        HashSet<Integer> union = new HashSet<>(hashset);
        union.addAll(hashset2);
    }
}
