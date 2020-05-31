package Inheritance;

public class Class2 extends Class1{

    private double balance;

    public Class2(){};

    public Class2(double balance, int number, String name )
    {
        super(number,name);
        this.balance = balance;
    }
    public Class2(double balance )
    {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
