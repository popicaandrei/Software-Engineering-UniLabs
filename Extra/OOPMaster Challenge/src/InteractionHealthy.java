import java.util.Scanner;

public class InteractionHealthy extends InteractionBasic {

    public int avocado;
    public int guacamole;
    public int carrots, tomatoes, lettuces;

    InteractionBasic basic1 = new InteractionBasic();


    public void setHealthy() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("U chose the Healthy Burger!");
        basic1.setBasic();

        System.out.println("Number of avocados?");
        avocado = scanner.nextInt();
        System.out.println("Number of guacamoles?");
        guacamole = scanner.nextInt();
    }
}