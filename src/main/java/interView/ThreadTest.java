package interView;

import java.util.Random;

public class ThreadTest {

    static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Consumer test = new Consumer();
        Producer prod1 = new Producer(test, "thread-1");
        Producer prod2 = new Producer(test, "thread-2");
        prod1.start();
        prod2.start();
    }
}

class Producer extends Thread {
    Consumer test;
    String message;

    Producer(Consumer test, String msg) {
        this.test = test;
        message = msg;
    }

    public void run() {
        Random rand = new Random();
        int randomNum = rand.nextInt((1000 - 10) + 1) + 10;
        System.out.println(message);
    }
}

class Consumer {
    private int count = 0;

    public int nextCounter() {
        synchronized (this) {
            count++;
            return count;
        }
    }
}
