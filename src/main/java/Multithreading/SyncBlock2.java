package Multithreading;

public class SyncBlock2 {//Data Race - проблема, когда 2 и более потоков обращаются к одной
    //и той же переменной и как минимум 1 поток изменяет её
    static int counter = 0;

    //теперь операцию может выполнять только один поток, другие ждут очередь-возможность
    public static void increment() {
        //когда this не получается использовать
        synchronized (SyncBlock2.class){
            counter++;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new R2());
        Thread thread2 = new Thread(new R2());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

class R2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Ex11.increment();
        }
    }
}
