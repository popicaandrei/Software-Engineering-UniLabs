package Ex1;

import java.util.Observable;

public class Sensor extends Observable implements Runnable {

    private int temp;

    public Sensor() {

    }

    public int getTemp() {
        return temp;
    }

    @Override
    public void run() {

        while (true) {
            try {
                this.temp = (int) (Math.random() * 100);
                setChanged();
                notifyObservers();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
    }
}
