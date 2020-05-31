package Ex1;

public class Main {

    public static void main(String[] args) {

        Sensor sensor =new Sensor();
        TempMonitor monitor = new TempMonitor();

        Thread t= new Thread(sensor,"MeasureTemp");
        t.start();
        sensor.addObserver(monitor);
    }
}
