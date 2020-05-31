package Ex3;

public class CounterThreads extends Thread {

    private static int ok;

    static class Counter1 implements Runnable {
        private Thread thread1;

        public void start(){
            if (thread1 == null) {
                new Thread(thread1);
                thread1.start();
            }
        }

        synchronized public void run() {

            for (int i = 1; i <= 20; i++) {
                System.out.println(thread1.getName() + "i= " + i);
            }
            System.out.println(thread1.getName() + " job done ");
            ok=1;
            notify();
        }
    }

    static class Counter2 implements Runnable {
        private Thread thread2;

        public void start(){
            if(thread2==null){
                thread2 = new Thread(this);
                thread2.start();
            }
        }
        synchronized public void run() {

            while (ok == 0)
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            thread2.setPriority(9);
            for (int i = 21; i <= 40; i++) {
                System.out.println(thread2.getName() + "i= " + i);
            }
            System.out.println(thread2.getName() + " 2nd job done ");
        }
    }

    public static void main(String[] args) {
        ok = 0;
        Counter1 c1 = new Counter1();
        Counter2 c2 = new Counter2();

        c1.start();
        c2.start();

    }

}
