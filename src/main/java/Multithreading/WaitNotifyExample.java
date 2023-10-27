package Multithreading;

public class WaitNotifyExample {
    public static void main(String[] args) {
        Market market = new Market();
        Thread producer = new Thread(new Producer(market));
        Thread customer = new Thread(new Customer(market));
        producer.start();
        customer.start();

    }
}

class Market{
    private int breadCount = 0;

    //можно для всего метода написать synchronized
    public synchronized void getBread() {
            //пока хлеба нет, то запускается wait
            while (breadCount < 1) {
                try {
                    //wait освобождает монитор
                    wait();//может принимать миллисекунды
                    //пока хлеба нет, переходим в метод, где добавляем его
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            //иначе
            breadCount--;
            System.out.println("Купили 1 хлеб");
            System.out.println("Количество хлеба = " + breadCount);
            //будит поток
            notify();
    }

    //можно для всего метода написать synchronized
    public synchronized void putBread() {
            //пока хлеба дофига, запускай метод wait, передавай другому потоку руль
            while (breadCount >= 5) {
                try {
                    //wait освобождает монитор
                    wait();
                    //пока хлеба много, переходим в метод, где забираем его
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            //иначе
            breadCount++;
            System.out.println("Добавили один хлеб");
            System.out.println("Количество хлеба = " + breadCount);
            //будит поток
            notify();
    }
}

class Producer implements Runnable {
    Market market = new Market();
    Producer(Market market){
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Customer implements Runnable {
    Market market = new Market();
    Customer(Market market){
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}
