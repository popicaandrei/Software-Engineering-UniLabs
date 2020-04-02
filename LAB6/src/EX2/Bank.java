package EX2;

import java.util.ArrayList;
import java.util.Collections;

public class Bank {

    ArrayList<BankAccount> accounts = new ArrayList<>();

    public void addAccounts(String owner, double balance){
        BankAccount newBankAccount = new BankAccount(owner,balance);
        accounts.add(newBankAccount);
    }

    public void printAccounts(){
        Collections.sort(accounts, new Comp());

        for(BankAccount i:accounts)
            System.out.println(i.toString());
    }

    public void printAccounts(double minBalance,double maxBalance){
           //Collections.sort(accounts,new Comp());

           for(BankAccount i:accounts){
               if(i.getBalance()>=minBalance && i.getBalance()<=maxBalance)
                   System.out.println(i.toString());
           }
    }

    public void printAccounts2() {
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println(i+" "+accounts.size()+" "+accounts.get(i).getOwner());
        }
    }

    public BankAccount getAccount(String owner){

        for(BankAccount i:accounts)
            if(i.getOwner() == owner) return i;

        return null;
    }

}


