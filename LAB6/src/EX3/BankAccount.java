package EX3;
import java.util.Objects;

public class BankAccount  {

    private String owner;
    private double balance;

    public BankAccount(String owner,double balance) {
        this.balance=balance;
        this.owner=owner;
    }


    public void withdraw(double sum) {
        if(sum>0 || balance-sum>0) this.balance -= sum;
        else System.out.println("transaction can't be made");
    }

    public void deposit(double sum) {
        if(sum>0) this.balance += sum;
        else System.out.println("error in transaction");
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object object) {

        if(!(object instanceof BankAccount)) return false;
        else {
           BankAccount bankAccount =  (BankAccount)object;
            return owner==bankAccount.owner;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, balance);
    }



}

