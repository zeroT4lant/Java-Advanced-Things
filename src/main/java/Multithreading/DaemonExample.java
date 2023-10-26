package Multithreading;

public class DaemonExample {

}

class UserThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getState() + " is daemon: " + isDaemon());
    }
}
