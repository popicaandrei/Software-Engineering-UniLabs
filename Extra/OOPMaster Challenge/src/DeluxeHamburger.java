public class DeluxeHamburger extends Hamburger{
    private String drink;
    private String chips;
    private double newPrice=15;


    public DeluxeHamburger(String drink,String chips,String meat){
        super("Brown bread",meat);
        this.drink=drink;
        this.chips=chips;
    }

    public void setIngredients(int a, int b, int c, int d, int e ){
        System.out.println("The deluxe burger can't be customised");
    }

    public double getPrice() {
        return newPrice;
    }

    public void setPrice() {
        this.newPrice = 15;
    }
}
