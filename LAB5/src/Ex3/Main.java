package Ex3;
import java.lang.*;
public class Main {

    public static void main(String[]args) throws InterruptedException {

        Controller controller= new Controller();
        LightSensor lightSensor= new LightSensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        for(int i=0;i<3;i++)
        {System.out.println(lightSensor.readValue()+"\n"+temperatureSensor.readValue());}

        controller.control();
    }
}
