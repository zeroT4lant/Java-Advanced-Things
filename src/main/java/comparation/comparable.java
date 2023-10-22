package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparable {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Zaur");
        list.add("Name");
        list.add("Piper");

        System.out.println("Before sort");
        System.out.println(list);

        Collections.sort(list);
        System.out.println("After sort");
        System.out.println(list);
    }
}
