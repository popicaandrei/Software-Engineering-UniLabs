package Ex1;

public class Circle extends Shape{

    protected double radius;

    public Circle (){radius=0;}

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(String color,boolean filled,double radius) {
        super(color,filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea()
    {
        return 3.14*radius*radius;
    }
    public double getPerimeter()
    {
        return 3.14*2*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
