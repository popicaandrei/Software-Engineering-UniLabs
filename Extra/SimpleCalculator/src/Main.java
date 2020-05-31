public class Main {

    public static void main(String[] args) {

           SimpleCalculator calculator = new SimpleCalculator();

           calculator.setFirstNumber(2.5);
           calculator.setSecondNumber(5);

           double nu=calculator.getFirstNumber();
           System.out.println(nu+9+"\n");

          System.out.println("add = "+calculator.getAdditionResult());
          System.out.println("sub = "+calculator.getSubractionResult());
          System.out.println("mul = "+calculator.getMultiplicationResult());
          System.out.println("div = "+calculator.getDivisionResult());

    }
}
