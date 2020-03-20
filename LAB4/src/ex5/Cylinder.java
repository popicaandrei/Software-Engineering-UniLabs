package ex5;

public class Cylinder extends Circle {
    private double height =1.0;


    public Cylinder()
    { }

    public Cylinder(double radius) {
           super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume()
    {
        return getArea()*height;
    }

}
