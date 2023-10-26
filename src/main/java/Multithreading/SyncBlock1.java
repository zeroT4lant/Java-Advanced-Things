package Multithreading;

public class SyncBlock1 {
    public static void main(String[] args) {
        MyRunnableImpl_2 runnable = new MyRunnableImpl_2();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        //с разной скоростью меняют-перезаписывают и выводят значение
        //data race
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter2{
    //статичную переменную можно использовать и изменять из других мест программы
    static int count = 0;

}

class MyRunnableImpl_2 implements Runnable{

    private void doWork2(){
        System.out.println("ura!!!");
    }

    //если поставить synchronized, то числа выводят очередность в правильном порядке
    private void doWork1(){
        //не синхронизированн, выполняется рандомно
        doWork2();

        //в данном случае синхронизация на "runnable"
        //в скобках чей блок кода мы будем lock'ать
        //синхронизация только части кода
        synchronized (this){
            Counter2.count++;
            System.out.println(Counter2.count);
        }

    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}
