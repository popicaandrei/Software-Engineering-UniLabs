class Car{

    private boolean engine;
    private int cylinders;
    private String color;
    private int wheels;
    private int speed;

    public Car(int cylinders,String color,int speed){
        this.engine = true;
        this.cylinders = cylinders;
        this.color=color;
        this.wheels = 4;
        this.speed=speed;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void startEngine(){
        if(engine==true)
            System.out.println("avem motor, bagam la pedala");
    }

    public int accelerate(int acceleration) {
        if(this.speed < 0) return -1;
        else if(this.speed > 100) return -1;
        else return this.speed+acceleration;
    }

    public int brake (int brake){
        if(this.speed<0) return -1;
        else return this.speed-brake;
    }
}

class Mertan extends Car{

    //private String name;

    /*public Mertan(String name, String color, int cylinders,int speed){
        super(4,color,speed);
        this.name=name;
    }*/

    public Mertan() {
        super(4, "blue", 0);
    }

    public void startEngine()
    {
        System.out.println("taca paca am pornit");
    }

    public int brake(int brake2){
        return getSpeed()-brake2;
    }

}

class Meleu extends Car{
    private String model;
    private int newSpeed;

   /* public Meleu(int cylinders, String color, int speed, String model) {
        super(cylinders, color, speed);
        this.model = model;
    }*/

    public Meleu() {
        super(4, "blue", 0);
    }

    public void startEngine(){
        System.out.println("decolare");
    }

    public void setSpeed(int newSpeed) {
        this.newSpeed = newSpeed;
    }

    public int accelerate(int speed)
    {
        return this.newSpeed+speed;
    }

    public int brake(int brake)
    {
        return this.newSpeed-brake;
    }
}



public class Main {

    public static void main(String[] args) {

       // Car car = new Car(4, "black", 56);
        //Car car2 = new Car(8, "pink", 98);

        Car car= Choice();
        car.startEngine();
       //System.out.println(car.brake(10));
        System.out.println(car.getColor());
        System.out.println(car.getCylinders());
        System.out.println(car.getSpeed());
        System.out.println(car.accelerate(100));
        car.setSpeed(60);
        System.out.println(car.brake(50));

    }
        public static Car Choice () {
        int choice= (int) (Math.random()*2)+1;
            System.out.println(choice);
            switch (choice) {

                case 1:
                    return new Meleu();
                case 2:
                    return new Mertan();

            }

            return null;
        }

}
