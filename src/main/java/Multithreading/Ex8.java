package Multithreading;

public class Ex8 extends Thread{
    public void run(){
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable());
        Ex8 thread2 = new Ex8();
        Thread thread3 = new Thread(() -> System.out.println("yo"));
        thread1.start();
        thread2.start();
        thread3.start();

        //теперь end будет ждать пока два потока закончат свою работу
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println("end");
    }
}

class MyRunnable implements Runnable{
    //поскольку мы переписываем реализацию класса run
    //мы не можем прописать, что метод кидает исключение
    //так что оборачиваем в try/catch
    public void run(){
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
