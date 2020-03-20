package ex3;

public class Book extends Author {
    private String name;
    Author author;
    private double price;
    private int qtyStock=0;

    public Book(java.lang.String name, java.lang.String email, char gender, java.lang.String name1, Author string, double price, int qtyStock) {
        super(name, email, gender);
        this.name = name1;
        this.price = price;
        this.qtyStock = qtyStock;
    }

    public Book(java.lang.String name, java.lang.String email, char gender, java.lang.String name1, Author string, double price) {
        super(name, email, gender);
        this.name = name1;
        this.price = price;
    }

    @Override
    public java.lang.String getName() {
        return name;
    }

    public Book(String name, String email, char gender, Author author) {
        super(name, email, gender);
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyStock() {
        return qtyStock;
    }

    public void setQtyStock(int qtyStock) {
        this.qtyStock = qtyStock;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                '}';
    }
}
