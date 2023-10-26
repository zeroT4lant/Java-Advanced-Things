package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Semen",lock);
        new Employee("Igor",lock);
        new Employee("Egor",lock);
        new Employee("Vanya",lock);
        new Employee("Pasha",lock);
    }
}

class Employee extends Thread{
    String name;
    private Lock lock;

    public Employee(String name,Lock lock){
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        //позволяет обработать случай или сделать что-то другое, когда поток занят
        if (lock.tryLock()) {
            try {
//            System.out.println(name + " ждёт...");
//            lock.lock();
                System.out.println(name + " пользуется банкоматом");
                Thread.sleep(2000);
                System.out.println(name + " завершил свои дела");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }

        } else {
            System.out.println(name + " не хочет ждать в очереди");
        }
    }
}
