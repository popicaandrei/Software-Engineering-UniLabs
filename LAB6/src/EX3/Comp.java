package EX3;

import java.util.Comparator;

public class Comp implements Comparator<BankAccount> {

    public int compare(BankAccount x1, BankAccount x2){
          double  flag =  x1.getBalance()-x2.getBalance();
          if(flag==0) return 0;
          if(flag>0) return 1;
          return -1;
    }
}

class Comp2 implements Comparator<BankAccount>{

    public int compare(BankAccount x1, BankAccount x2){
        return (int)x1.getOwner().compareTo(x2.getOwner());

    }
}
