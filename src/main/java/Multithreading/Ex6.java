package Multithreading;

public class Ex6 implements Runnable {
    //main - тоже поток
    public void run() {
        System.out.println("Method run. Method name = " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Ex6());
        thread1.start();
        System.out.println("Method main. Method name = " + Thread.currentThread().getName());
    }
}
