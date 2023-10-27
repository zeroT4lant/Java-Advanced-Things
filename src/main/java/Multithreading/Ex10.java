package Multithreading;

public class Ex10 {
    public static void main(String[] args) {

            //вместо создания нового объекта внутри треда
            //создали здесь сразу
            MyRunnableImpl_1 runnable = new MyRunnableImpl_1();
            Thread thread1 = new Thread(runnable);
            Thread thread2 = new Thread(runnable);
            Thread thread3 = new Thread(runnable);
            //с разной скоростью меняют-перезаписывают и выводят значение(без synchronized)
            //data race
            thread1.start();
            thread2.start();
            thread3.start();
    }
}

class Counter{
    //статичную переменную можно использовать и изменять из других мест программы
    static int count = 0;

}

class MyRunnableImpl_1 implements Runnable{


    //Монитор на обьекте this в методе ниже
    //если поставить synchronized, то числа выводят очередность в правильном порядке
    public synchronized void increment(){
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}
