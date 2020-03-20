package ex4;

public class Main {

    public static void main(String[] args) {


        Author authorA = new Author("dumas","tac",'m');
        Author authorB = new Author("dumas2","pac",'f');

        Author[] authors={authorA,authorB};

      Book book = new Book("NumeCarte1",authors,4,12);

        System.out.println(book.getName()+"\n");
        //System.out.println(book.getAuthor());

        book.printAut();


    }
}
