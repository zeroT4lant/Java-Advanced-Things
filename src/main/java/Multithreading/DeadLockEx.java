package Multithreading;

public class DeadLockEx {
    //Deadlock - ситуация, когда 2 и более потоков залочены навсегда, ждут друг-друга и ничего не делают
    //LiveLock - ситуация, когда потоки залочены навсегда, ожидают друг-друга, проделывают работу без прогресса
    //Lock starvation - ситуация, когда менее приоритетные потоки не дожидаются своей очереди

    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread10: Попытка захватить монитор объекта Lock1");
        synchronized (DeadLockEx.lock1){
            System.out.println("Thread10: Монитор захвачен");
            System.out.println("Thread10: Попытка захватить монитор объекта Lock2");
            synchronized (DeadLockEx.lock2) {
                System.out.println("Thread10: Монитор объекта Lock1 и Lock2 захвачены");
            }
        }
    }
}

class Thread20 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread20: Попытка захватить монитор объекта Lock2");
        synchronized (DeadLockEx.lock2){
            System.out.println("Thread20: Монитор lock2 захвачен");
            System.out.println("Thread20: Попытка захватить монитор объекта Lock2");
            synchronized (DeadLockEx.lock1) {
                System.out.println("Thread20: Монитор объекта Lock1 и Lock2 захвачены");
            }
        }
    }
}
