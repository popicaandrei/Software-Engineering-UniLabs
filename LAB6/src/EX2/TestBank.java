package EX2;

import java.util.Collections;

public class TestBank  {
    public static void main(String[] args) {

        Bank bankEntity = new Bank();

        bankEntity.addAccounts("ghita",4566);
        bankEntity.addAccounts("popescu",120);
        bankEntity.addAccounts("pista",98);
        bankEntity.addAccounts("stef",13455);

        bankEntity.printAccounts();
        bankEntity.printAccounts(500,15000);

        Collections.sort(bankEntity.accounts,new Comp2());
        for(BankAccount i:bankEntity.accounts)
            System.out.println(i.toString());


    }

}
