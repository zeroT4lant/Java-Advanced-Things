package Multithreading;

public class WaitNotifyExample {
    public static void main(String[] args) {
        Market market = new Market();
        //или создать объекты продавца и покупателя
        //Producer producer = new Producer(market);
        //Customer customer = new Customer(market);

        //синхронизированны по одному и тому же маркету
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
            //если хлеба нет, то запускается wait
            while (breadCount < 1) {
                try {
                    //wait освобождает монитор
                    wait();//может принимать миллисекунды
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            breadCount--;
            System.out.println("Купили 1 хлеб");
            System.out.println("Количество хлеба = " + breadCount);
            notify();
    }

    //можно для всего метода написать synchronized
    public synchronized void putBread() {
            while (breadCount >= 5) {
                try {
                    //wait освобождает монитор
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
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
