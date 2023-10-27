package Multithreading;

public class Ex1 {

    //Создать поток можно, создав объект класса, расширяющего(extends) класс Thread, и который переписывает его метод run
    public static void main(String[] args) {
        MyThread1 tr1 = new MyThread1();
        MyThread2 tr2 = new MyThread2();
        tr1.start();
        tr2.start();
    }
}

class MyThread1 extends Thread{
    public void run(){
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        for (int i = 1000; i > 0 ; i--) {
            System.out.println(i);
        }
    }
}
