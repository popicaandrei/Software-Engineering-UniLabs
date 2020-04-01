package EX1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       List<BankAccount> list1 = new ArrayList<>();

        BankAccount account1,account2,account3;
        account1 = new BankAccount("Popica",4500);
        account2 = new BankAccount("Popica",1200);
        account3 = new BankAccount("Ghita",800);

        list1.add(account1);list1.add(account2);list1.add(account3);

        Iterator<BankAccount> it = list1.iterator();

        while(it.hasNext())
        {
            //Double d = it.next().getBalance();
            String name = (String) it.next().getOwner();
            System.out.println(name);
        }

        for (int i=0;i<list1.size();i++){
            if(i==list1.size()-1) break;
            System.out.println("comparison between" + i +" and "+ (int)(i+1) + " -> " + list1.get(i).equals(list1.get(i+1)));
            System.out.println("   " + list1.get(i).hashCode());
        }

    }
}
