package Ex3;

public abstract class Sensor {
    private String location;

    public abstract int readValue();

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

}
