package ex4;

import static java.lang.Math.sqrt;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint()
    {
        this.x=0;
        this.y=0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int a,int b)
    {
        this.x=a;
        this.y=b;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(int x,int y)
    {
        return sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
    }


}
