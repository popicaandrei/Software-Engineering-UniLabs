public class Main {
    public static void main(String[] args) {

        Carpet carpet2 = new Carpet(3.5);
        Floor floor =new Floor(2.75,4);

        Calculator calculator = new Calculator(floor,carpet2);
        
        System.out.println("total1 = " + calculator.getTotalCost());

        Carpet carpet1 = new Carpet(1.5);
        Floor floor1 = new Floor(5.4,4.5);
        calculator = new Calculator(floor1,carpet1);
        System.out.println("total2 = "+ calculator.getTotalCost());
    }
}
