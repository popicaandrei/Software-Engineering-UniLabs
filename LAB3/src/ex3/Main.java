package ex3;

public class Main {
    public static void main(String[] args) {

        Author aut = new Author("popi","1@gmail.com",'m');
        System.out.println(aut.getEmail());
        System.out.println(aut.getGender());
        System.out.println(aut.getName());
        System.out.println("\n"+aut.toString());
    }
}
