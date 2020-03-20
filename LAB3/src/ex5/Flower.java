package ex5;

public class Flower{
    int petal;
    Flower(){
        System.out.println("Flower has been created!");
    }

    public static int count=0;

    public static void main(String[] args) {

        Flower[] garden = new Flower[10];
        for(int i =0;i<10;i++){
            Flower f = new Flower();
            garden[i] = f;
            count++;
        }

        System.out.println(printCount());
    }

    public static String printCount(){
       return "Se apeleaza de: "+count+" ori";
    }
}