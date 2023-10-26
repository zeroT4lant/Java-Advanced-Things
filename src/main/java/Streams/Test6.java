package Streams;

import java.util.stream.Stream;

public class Test6 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,1,2,3);


        Stream<Integer> stream2 = Stream.of(1,2,3,4,5);
        Stream<Integer> stream3 = Stream.of(6,7,8,9,10);
        //объединяет concat
        Stream<Integer> stream4 = Stream.concat(stream2,stream3);
        //forEach - тоже результирующий, так как возвращает void
        stream4.forEach(i -> System.out.println(i));



        //уникальные значения - distinct
        System.out.println("distinct");
        Stream<Integer> stream6 = Stream.of(1,2,3,4,5,1,2,3);
        stream6.distinct().forEach(System.out::println);

        //стримы нельзя переиспользовать после результирующего метода
//        System.out.println(stream6.count());
        System.out.println("count");
        Stream<Integer> stream7 = Stream.of(1,2,3,4,5,1,2,3);
        System.out.println(stream7.count());

        //промежуточный метод peek
        //помогает не выходя из цепи посмотреть результат работы методов цепи на разных этапах
        System.out.println("peek");
        Stream<Integer> stream8 = Stream.of(1,2,3,4,5,1,2,3);
        System.out.println(stream8.distinct().peek(System.out::println).count());


    }
}
