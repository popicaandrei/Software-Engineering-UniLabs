package Ex2;

public class Controller {
    StockModel stockModel;
    View view;

    public Controller (StockModel sm, View v){
        this.stockModel = sm;
        this.view=v;
        this.stockModel.addObserver(v);
    }

    public void  addStock(ProductModel p){
        stockModel.addProduct(p);
    }

    public void  deleteStock(ProductModel p){
        stockModel.deleteProduct(p);
    }

    public void  viewStock(){
        stockModel.viewProducts();
    }

    public void updateStock(ProductModel p, int q){
        stockModel.changeQuantity(p,q);
    }


    public static void main(String[] args) {

        StockModel stock = new StockModel();
        View view =new View();

        Controller controller = new Controller(stock,view);

        ProductModel product1 = new ProductModel("Bike",1,100);
        ProductModel product2 = new ProductModel("Computer",3,500);
        ProductModel product3 = new ProductModel("Drone",5,300);
        ProductModel product4 = new ProductModel("Phone",10,400);

        controller.addStock(product1);
        controller.addStock(product2);
        controller.addStock(product3);

        controller.viewStock();

        controller.deleteStock(product2);
        controller.viewStock();
        controller.addStock(product4);
        controller.updateStock(product4,15);
        controller.viewStock();
    }
}
