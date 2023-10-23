package HashMap_AndHashTableTheory;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    //отличие HashMap от HashTable(синхронизирован, поэтому его методы не такие быстрые)
    //в HashTable ни ключ, ни значение не могут быть null
    //если нужна поддержка многопоточности лучше использовать ConcurrentHashMap

    public static void main(String[] args) {
        HashMap<String,Integer> obshaga1 = new HashMap<>();
        obshaga1.put("Andrew Kondratyev",405);
        obshaga1.put("Kirik",405);
        obshaga1.put("Dinar",405);
        System.out.println(obshaga1.get("Andrew Kondratyev"));
        System.out.println(obshaga1.keySet());
        System.out.println(obshaga1.values());
        System.out.println(obshaga1.containsKey("Kirik"));
        System.out.println(obshaga1.containsValue(405));
        System.out.println(obshaga1.isEmpty());
        for (Map.Entry<String,Integer> e : obshaga1.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }


        HashMap<String,Integer> obshaga = new HashMap<>();
        obshaga.put("Botinok",407);
        obshaga.put("I am",407);
        obshaga.put("Maksos",407);
        //добавь если такого нет, проверка по ключу
        obshaga.putIfAbsent("Maksim",405);
        System.out.println(obshaga);

        System.out.println(obshaga.get("I am"));


        obshaga.remove("Botinok");
        System.out.println(obshaga);

        System.out.println(obshaga.containsValue(405));

        System.out.println(obshaga.keySet());
        System.out.println(obshaga.values());

        for (Map.Entry<String,Integer> e : obshaga.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

    }
}
