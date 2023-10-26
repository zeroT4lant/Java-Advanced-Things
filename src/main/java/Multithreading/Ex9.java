package Multithreading;

public class Ex9 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main begins");
        Thread workerThread = new Thread(new Worker());
        //new - только создали
        System.out.println(workerThread.getState());

        workerThread.start();
        //Runnable - выполняется
        //делится на готовый(ready) и выполняющийся(running)
        System.out.println(workerThread.getState());
        //в параметр join можно задать время ожидания других потоков
        workerThread.join();
        //после join'a уже Terminated - вычислен
        System.out.println(workerThread.getState());
        System.out.println("Method main ends");
    }
}

class Worker implements Runnable{
    @Override
    public void run() {
        System.out.println("work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("work end");
    }
}
