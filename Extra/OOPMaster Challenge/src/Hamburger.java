public class Hamburger
{
    private String name;
    private String bread;
    private String meat;
    private int numberTomatoes;
    private int numberLettuce;
    private int numberCarrot;
    private double price=7.5;

    public Hamburger(){}

    public Hamburger(String bread, String meat) {
        this.bread = bread;
        this.meat = meat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(int numberCarrot,int numberLettuce,int numberTomatoes,int x, int y) {

        this.numberCarrot = numberCarrot;
        this.numberTomatoes = numberTomatoes;
        this.numberLettuce= numberLettuce;

        System.out.println("You ordered: carrots="+this.numberCarrot+"tomatoes="+this.numberTomatoes+"lettuces="+this.numberLettuce);
    }

    public String getBread() {
        return this.bread;
    }

    public void setPrice() {
        this.price+=3.5*numberTomatoes+2*numberLettuce+5*numberCarrot;
    }

    public double getPrice() {
        return this.price;
    }
}
