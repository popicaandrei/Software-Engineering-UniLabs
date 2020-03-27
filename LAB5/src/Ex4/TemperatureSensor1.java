package Ex4;

public class TemperatureSensor1 extends Sensor1 {

    public int readValue()
    {
        int random=(int)(Math.random()*100+1);
        return random;
    }
}
