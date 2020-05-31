package Inheritance;

public class Main {

    public static void main(String[] args) {
        Class3 o = new Class3(45,2,"name");

        System.out.println(o.toString());
        System.out.println(o.getBalance());
        o.setBalance(90);
        System.out.println(o.getBalance());
    }
}
