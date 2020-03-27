package Ex3;

public class LightSensor extends Sensor {

    public int readValue()
    {
        int random=(int)(Math.random()*100+1);
        return random;
    }

}
