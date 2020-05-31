
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

   private String name;

    public Mertan(String name, String color, int cylinders,int speed){
        super(4,color,speed);
        this.name=name;
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

    public Meleu(int cylinders, String color, int speed, String model) {
        super(cylinders, color, speed);
        this.model = model;
    }

    public void startEngine(){
        System.out.println("decolare");
    }

    public int brake(int brake)
    {
        return getSpeed()-brake;
    }
}



public class Main {

    public static void main(String[] args) {

        Car car = new Car(4, "black", 56);
        Car car2 = new Car(8, "pink", 98);
        int choice = 1;
        Mertan mertan = new Mertan("glc", "black", 4, 120);
        Meleu meleu = new Meleu(4, "blue", 190, "mel");

        switch (choice) {

            case 1:
                return car.meleu.startEngine();
            case 2:
                return car2.mertan.startEngine();
        }
    }

}
