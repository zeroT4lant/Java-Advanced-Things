package Multithreading;

public class VolatileEx extends Thread{
    //пометка переменной, хранящейся только в основной памяти
    //используется, когда только один поток изменяет значение этой переменной, а остальные читают
    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b){
            counter++;
        }
        System.out.println("Loop is finished, Counter = "+ counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileEx thread = new VolatileEx();
        //начали счёт counter'a
        thread.start();
        //метод типо работает 3 секунды(на самом деле выполнился сразу быстро)
        Thread.sleep(3000);
        System.out.println("wake up after 3 sec");
        // меняет на thread.b = false; этим завершает цикл в thread.start();
        thread.b = false;
        //дождался окончания метода thread.start();
        thread.join();
        System.out.println("End");
    }
}
