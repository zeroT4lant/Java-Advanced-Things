package NestedClass.Anonymous_class;


//чтобы на ходу переписывать методы класса
public class AnonymousClass {
    public static void main(String[] args) {
        //анонимный класс переписывает метод doOperation
        Math m = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };
        System.out.println(m.doOperation(3,2));

        Math m2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };
        System.out.println(m2.doOperation(2,3));

    }
}

class Math{
    int doOperation(int a,int b){
        return a/b;
    }
}
