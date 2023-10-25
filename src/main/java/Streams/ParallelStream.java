package Streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        //норм пример
        double sumRes = list.parallelStream()
                .reduce(0.0,(acc,el) -> acc + el);
        System.out.println(sumRes);

        //с операциями, где важна последовательность - плохо
        //с операциями, где не важна последовательность - хорошо


    }
}
