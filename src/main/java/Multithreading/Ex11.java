package Multithreading;

public class Ex11 {
    //Data Race - проблема, когда 2 и более потоков обращаются к одной
    //и той же переменной и как минимум 1 поток изменяет её
    static int counter = 0;

    //теперь операцию может выполнять только один поток, другие ждут очередь-возможность
    public static synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

class R implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Ex11.increment();
        }
    }
}
