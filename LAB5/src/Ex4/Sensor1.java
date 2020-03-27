package Ex4;

public abstract class Sensor1 {
    private String location;

    public abstract int readValue();

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

}
