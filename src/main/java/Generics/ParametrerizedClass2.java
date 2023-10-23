package Generics;

public class ParametrerizedClass2 {


    public static void main(String[] args) {
        Pair<String,Integer> chel = new Pair<>("Chelik",19);
        System.out.println(chel.getFirstValue());
        System.out.println(chel.getSecondValue());

        otherPair<Double,String> student1 = new otherPair<>();
    }
}

class Pair<V1,V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1,V2 value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue(){
        return value1;
    }

    public V2 getSecondValue(){
        return value2;
    }
}

class otherPair<K,V> {
    private K key;
    private V value;

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }
}
