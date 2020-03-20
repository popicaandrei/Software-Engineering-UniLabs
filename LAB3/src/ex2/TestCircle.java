package ex2;

public class TestCircle extends Circle {

    public TestCircle(double radius, String color) {
        super(radius, color);
    }

    public void testClass(){

    Circle circle = new Circle (3.5,"magenta");

        System.out.println(circle.getRadius());
        circle = new Circle(5);
        System.out.println(circle.getArea());
    }
}
