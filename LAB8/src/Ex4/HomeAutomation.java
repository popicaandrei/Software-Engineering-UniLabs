package Ex4;

public class HomeAutomation {

    public static void main(String[] args){

        //test using an annonimous inner class
        Home h = new Home(){
            protected void setValueInEnvironment(Event event){
                System.out.println("New event in environment "+event);
            }
            protected void controllStep(){
                System.out.println("Control step executed");
            }
        };
        h.simulate();
    }
}