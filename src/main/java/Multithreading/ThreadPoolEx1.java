package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx1 {
    // execute передаёт таски в тредпул
    // executorService.shutdown() - прекращает приём таск и выполнив поступившие, заканчивает работу

    public static void main(String[] args) throws InterruptedException {
        //newSingleThreadExecutor() с пустым аргументом создаст пул с одним потоком
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        //5 потоков по 2 раза выполняют задание
        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableImpl100());
        }
        //закрывает пул с потоками
        executorService.shutdown();
        //выполняется независимо, закрывает пул, если он не успел за отведённое время
        executorService.awaitTermination(5000, TimeUnit.MILLISECONDS);

        System.out.println("Main ends");

    }
}

class RunnableImpl100 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " ends work");

    }
}
