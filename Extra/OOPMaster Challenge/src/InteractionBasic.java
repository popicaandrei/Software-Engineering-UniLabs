import java.util.Scanner;

public class InteractionBasic {

    Scanner scanner = new Scanner(System.in);

    public String bread, meat;
    public int guacamole, avocado, carrots, tomatoes, lettuces;

    public void setBasic() {
        System.out.println("what type of bread?:");
        this.bread = scanner.nextLine();
        System.out.println("what type of meat?:");
        this.meat = scanner.nextLine();
        System.out.println("Number of Tomatoes?:");
        tomatoes = scanner.nextInt();
        System.out.println("Number of carrots?:");
        carrots = scanner.nextInt();
        System.out.println("Number of lettuces?:");
        lettuces = scanner.nextInt();

    }

}