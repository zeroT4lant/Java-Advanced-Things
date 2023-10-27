package Multithreading;

public class Ex4 {
    public static void main(String[] args) {
        //можно и так запустить поток
        //сразу создаём объект потока, с параметром new Runnable в параметре, который переписывает метод run()
        //и сразу же его стартует
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("privet");
            }
        }).start();
        //либо написать с лямбда-функцией
        new Thread(() -> System.out.println("privet")).start();
    }
}
