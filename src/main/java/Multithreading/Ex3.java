package Multithreading;

public class Ex3 {
    public static void main(String[] args) {
        //создаём тред и указываем в параметрах к какому классу имплементирующему интерфейс Runnable относится
        //внутри этого класса также перепиши метод run
        Thread thread1 = new Thread(new MyThread3());
        Thread thread2 = new Thread(new MyThread4());
        thread1.start();
        thread2.start();
    }
}

class MyThread3 implements Runnable{
    public void run(){
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread4 implements Runnable{
    public void run(){
        for (int i = 1000; i > 0 ; i--) {
            System.out.println(i);
        }
    }
}
