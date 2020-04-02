package EX3;

import java.util.TreeSet;

public class Bank {

    TreeSet<BankAccount> accounts = new TreeSet<BankAccount>(new Comp2());

    public void addAccounts(String owner, double balance){
        BankAccount newBankAccount = new BankAccount(owner,balance);
        accounts.add(newBankAccount);
    }

    public void printAccounts(){
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

    public BankAccount getAccount(String owner){

        for(BankAccount i:accounts)
            if(i.getOwner() == owner) return i;

        return null;
    }

}


