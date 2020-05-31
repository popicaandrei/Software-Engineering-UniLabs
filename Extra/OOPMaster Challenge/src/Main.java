import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello to your personal ordering app! \n\n What do you want to order?\n\n" );
        System.out.println("We have 1.basic burger(addional tomatoes, lettuce, carrots)");
        System.out.println("2.healthy burger-and u can choose also avocado or guacamole among the basic burger");
        System.out.println("3.deluxe burger with drinks and chips");


        Hamburger hamburger = new Hamburger();
        hamburger = Menu();


       //System.out.println(hamburger.getBread());

        InteractionHealthy healthy = new InteractionHealthy();

        hamburger.setIngredients(healthy.carrots,healthy.lettuces,healthy.tomatoes,healthy.avocado,healthy.guacamole);
        System.out.println("fkndvhjfv"+ healthy.carrots);
        hamburger.setPrice();
        System.out.println(hamburger.getPrice());


     }


       public static Hamburger Menu() {

           Scanner scanner = new Scanner(System.in);
           int option = scanner.nextInt();

           InteractionBasic basic = new InteractionBasic();
           InteractionHealthy healthy = new InteractionHealthy();

           switch (option) {
               case 1:
                   System.out.println("U chose the basic burger");
                   basic.setBasic();
                   return new Hamburger(basic.bread, basic.meat);
               case 2:
                   healthy.setHealthy();
                   return new Hamburger(healthy.bread,healthy.meat);
               case 3:
                   System.out.println("U chose Deluxe Hamburger");
                   return new DeluxeHamburger("Cola","Chio","Pork");
           }

           return null;
       }


    }

