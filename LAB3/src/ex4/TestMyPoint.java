package ex4;

public class TestMyPoint extends MyPoint {

    public static void main(String[] args) {
        MyPoint point = new MyPoint();
        point.setXY(5,7);

        System.out.println(point.toString());
        point.setX(43);
        System.out.println(point.getX());
        point.setY(12);
        System.out.println(point.getY());

        System.out.println(point.toString());

        point.setXY(2,3);
        System.out.println("the distance is:"+point.distance(5,7));

    }
}
