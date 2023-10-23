package Threads_Safe;

import java.util.ArrayList;

public class SynchronizedCollectionEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> source = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            source.add(i);
        }
        ArrayList<Integer> target = new ArrayList<>();
    }
}
