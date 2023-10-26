package Multithreading;

public class Ex12 {

    //нельзя синхронизировать конструктор
    //совершенно любой объект для синхронизации по одному нему
    static final Object lock = new Object();

    //можно прописать методу модификатор static, чтобы вызвать в методах других классов без создания объектов
    void mobileCall(){
        //использует монитор объекта lock
        synchronized (lock) {
            System.out.println("Mobile call started");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call ends");
        }
    }

    void SkypeCall(){
        //использует монитор объекта lock
        synchronized (lock) {
            System.out.println("Skype call started");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call ends");
        }
    }

    void WhatsUpCall(){
        //использует монитор объекта lock
        synchronized (lock) {
            System.out.println("WhatsUp call started");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("WhatsUp call ends");
        }
    }

    public static void main(String[] args) {
        //создаём треды звонков
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWhatsUp());

        thread1.start();
        thread2.start();
        thread3.start();

    }


}

class RunnableImplMobile implements Runnable{
    @Override
    public void run() {
        //создаём объект и вызываем, потому что метод mobileCall() не static
        new Ex12().mobileCall();
    }
}

class RunnableImplSkype implements Runnable{
    @Override
    public void run() {
        new Ex12().SkypeCall();
    }
}

class RunnableImplWhatsUp implements Runnable{
    @Override
    public void run() {
        new Ex12().WhatsUpCall();
    }
}
