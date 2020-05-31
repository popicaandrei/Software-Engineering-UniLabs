package Ex5;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Buffer b = new Buffer();
        Producer pro = new Producer(b);
        Consumer c = new Consumer(b);
        Consumer c2 = new Consumer(b);

        pro.start();
        c.start();
        c2.start();
    }
}


class Producer implements Runnable {
    private Buffer bf;
    private Thread thread;

    Producer(Buffer bf) {
        this.bf = bf;
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }

    public void run() {
        while (true) {
            bf.push(Math.random());
            System.out.println("Am scris.");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}


class Consumer extends Thread {
    private Buffer bf;

    Consumer(Buffer bf) {
        this.bf = bf;
    }

    public void run() {
        while (true) {
            System.out.println("Am citit : " + this + " >> " + bf.get());
        }
    }
}

class Buffer {
    ArrayList content = new ArrayList();

    synchronized void push(double d) {
        content.add(d);
        notify();
    }

    synchronized double get() {
        double d = -1;
        try {
            while (content.size() == 0) wait();
            d = (Double) content.get(0);
            content.remove(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return d;
    }
}