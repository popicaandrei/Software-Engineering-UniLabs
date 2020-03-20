package ex6;

public class Rectangular extends Shape {

    private double width =1.0;
    private double lenght =1.0;

    public Rectangular(){ }
    public Rectangular(double width,double lenght){
        super(true,"red");
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getArea(){
        return width*lenght;
    }
    public double getPerimeter(){
        return 2*width+lenght;
    }

    @Override
    public String toString() {
        return "Rectangular{" +
                "width=" + width +
                ", lenght=" + lenght +
                '}';
    }
}
