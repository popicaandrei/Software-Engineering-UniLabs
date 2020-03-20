package ex4;

public class Book {
    private String name;
    private Author[] author;
    private double price;
    private int qtyStock = 0;

    public Book(String name, Author[] author, double price, int qtyStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyStock = qtyStock;
    }

    public Author[] getAuthor() {
        return author;
    }

    public String getName() {
        return name;
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
                ", author=" + author.length +
                '}';
    }

    public void printAut() {
        for (Author e : author) {
            if (e != null) {
                System.out.println(e + "\n\n");
            }
        }
    }

    }

