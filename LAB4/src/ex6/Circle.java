package ex6;

public class Circle extends Shape {
    private double radius=1.0;
    private String color = "red";

    public Circle (){
        radius=0;
        color="";
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return 3.14*this.radius*this.radius;
    }

    public double getPerimeter(){
        return 2*3.14*radius;
    }


}