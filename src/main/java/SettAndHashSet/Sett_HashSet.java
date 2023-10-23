package SettAndHashSet;

import java.util.HashSet;
import java.util.Set;

public class Sett_HashSet {
    //Set хранит только уникальные элементы
    //HashSet не запоминает порядок элементов,в основе лежит HashMap
    //y HashSet: ключи - элементы, значения - константы заглушки
    public static void main(String[] args) {
        //рандомный порядок хранения
        Set<String> set = new HashSet<>();
        set.add("Egor");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");
//        set.add(null);//можно добавить null

        System.out.println(set);
        for (String s : set){
            System.out.println(s);
        }
    }






}
