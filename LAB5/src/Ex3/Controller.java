package Ex3;

public class Controller {

    TemperatureSensor tempSensor = new TemperatureSensor();
    LightSensor lightSensor = new LightSensor();

    public void control () throws InterruptedException {

        long t= System.currentTimeMillis();
        long end = t+5000;
        while(System.currentTimeMillis() < end) {

            System.out.println("\n temp measured: " + tempSensor.readValue());
            Thread.sleep(1000);
            System.out.println("\n light measured: " + lightSensor.readValue());
            Thread.sleep(1000);
        }
    }
}
