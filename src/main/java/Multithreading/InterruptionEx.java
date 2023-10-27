package Multithreading;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);

        //вызов прерывания потока
        thread.interrupt();//прерывание потока, замена stop()

        thread.join();
        System.out.println("main ends");
    }
}

class InterruptedThread extends Thread{
    double sqrtSum = 0;
    @Override
    public void run() {
        for (int i = 1; i < 1_000_000_000; i++) {
            //проверяем, если поток прерван, то обрабатываем дальнейшие действия
            if (isInterrupted()){
                System.out.println("Поток хотят прервать");
                System.out.println("mi ybedilis chto sostoyanie vsex objcs norm");
                System.out.println("i reshili end raboty potoka");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Поток хотят прервать во время сна, давайте заверщим его работу");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}
