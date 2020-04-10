package Ex1;

public class CoffeeTest {
    public static void main(String[] args) {
        CofeeMaker mk = new CofeeMaker();
        CofeeDrinker d = new CofeeDrinker();

        for(int i = 0;i<15;i++) {
            Cofee c = mk.makeCofee();
            try {
                d.drinkCofee(c,mk);
            } catch (TemperatureException e) {
                System.out.println("Exception:" + e.getMessage() + " temp=" + e.getTemp());
            } catch (ConcentrationException e) {
                System.out.println("Exception:" + e.getMessage() + " conc=" + e.getConc());
            } catch (CoffeesExcedeed cof) {
                System.out.println("Exception:"+cof.getMessage()+"standard number of coffees is:"+ cof.getNumber());
            }
            finally {
                System.out.println("Throw the cofee cup.\n");
            }
        }
    }
}

class CofeeMaker  {
    static int flag =0;
    Cofee makeCofee() {
        flag ++;
        System.out.println("Make a coffee");
        int t = (int)(Math.random()*100);
        int c = (int)(Math.random()*100);
        Cofee cofee = new Cofee(t,c);
        return cofee;
    }

    int numberCoffees(){
        return flag;
    }

}

class Cofee{
    private int temp;
    private int conc;
    private int number;

    Cofee(int t,int c){temp = t;conc = c;}
    int getTemp(){return temp;}
    int getConc(){return conc;}
    public String toString(){return "[cofee temperature="+temp+":concentration="+conc+"]";}
}

class CofeeDrinker{
    void drinkCofee(Cofee c, CofeeMaker maker) throws TemperatureException, ConcentrationException,CoffeesExcedeed{
        if(maker.numberCoffees()==10)
            throw new CoffeesExcedeed("too many coffees",10);
        if(c.getTemp()>60)
            throw new TemperatureException(c.getTemp(),"Cofee is to hot!");
        if(c.getConc()>50)
            throw new ConcentrationException(c.getConc(),"Cofee concentration to high!");
        System.out.println("Drink cofee:"+c);
    }
}

class CoffeesExcedeed extends Exception{
    int number;
    public CoffeesExcedeed(String text, int number){
        super(text);
        this.number=number;
    }
    int getNumber(){
        return this.number;
    }
}


class TemperatureException extends Exception{
    int t;
    public TemperatureException(int t,String msg) {
        super(msg);
        this.t = t;
    }

    int getTemp(){
        return t;
    }
}

class ConcentrationException extends Exception{
    int c;
    public ConcentrationException(int c,String msg) {
        super(msg);
        this.c = c;
    }

    int getConc(){
        return c;
    }
}