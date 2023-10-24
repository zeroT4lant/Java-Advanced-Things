package labda;

public class Test2 {

    static void def(I i){
        //
        System.out.println(i.abc("Slovo"));
    }

    public static void main(String[] args) {
        def((s) -> {return s.length();});

    }
}

interface  I {
    int abc(String s);
}
