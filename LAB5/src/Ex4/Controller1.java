package Ex4;

import Ex3.LightSensor;
import Ex3.TemperatureSensor;

public class Controller1 {

    TemperatureSensor tempSensor = new TemperatureSensor();
    LightSensor lightSensor = new LightSensor();
    private static Controller1 controller;

    private Controller1(){}

    public static Controller1 getController()
    {
        if(controller == null)  controller= new Controller1();
        return controller;
    }

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
