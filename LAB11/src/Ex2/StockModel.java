package Ex2;

import java.util.Observable;
import java.util.ArrayList;

public class StockModel extends Observable {

    ArrayList<ProductModel> stock= new ArrayList<ProductModel>();

    public void addProduct(ProductModel p){
        stock.add(p);
        setChanged();
        notifyObservers();
    }

    public void deleteProduct(ProductModel p){
        stock.remove(p);
        setChanged();
        notifyObservers();
    }

    public void viewProducts(){
        for(ProductModel p :stock){
            System.out.println("The products are: ");
            System.out.println(p.toString());
        }
    }

    public void changeQuantity(ProductModel p,int q){
           int position = stock.indexOf(p);
           stock.get(position).setQuantity(q);
           setChanged();
           notifyObservers();
    }

}
