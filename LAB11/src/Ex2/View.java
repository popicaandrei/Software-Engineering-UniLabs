package Ex2;

import java.util.Observer;

public class View implements Observer {

      StockModel stockModel;

    @Override
    public void update(java.util.Observable observable, Object o) {
           this.stockModel = (StockModel) observable;
           System.out.println("Stock changed!");
    }
}
