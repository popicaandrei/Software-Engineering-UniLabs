public class HealthyHamburger extends Hamburger{

    private int numberAvocado;
    private int numberGuacamole;
    private double newPrice;

    public HealthyHamburger(String bread,String meat,int numberAvocado,int numberGuacamole){
        super(bread,meat);
        this.numberAvocado=numberAvocado;
        this.numberGuacamole = numberAvocado;
    }

    public void setIngredients(int tomatoes,int lettuce,int carrots,int numberAvocado,int numberGuacamole){

        this.numberGuacamole = numberGuacamole;
        this.numberAvocado = numberAvocado;
        super.setIngredients(carrots,lettuce,tomatoes,0,0);


    }

    public String getBread(){
        System.out.println("csdjkcnhjsdcs");
        return super.getBread();
    }

    public void setPrice() {
           super.setPrice();
           newPrice = super.getPrice() + 7*numberGuacamole + 7*numberAvocado;
    }

    public double getPrice() {
        return newPrice;
    }
}
