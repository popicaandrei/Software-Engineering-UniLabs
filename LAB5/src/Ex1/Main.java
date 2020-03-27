package Ex1;

public class Main{

public static void main(String[]args){
        Shape[] shapes = new Shape[6];


        shapes[0] = new Circle("red",true,2);
        shapes[1] = new Circle ("blue",false,3);
        shapes[2] = new Circle("black",true,5);
        shapes[3] = new Rectangle(3,4);
        shapes[4] = new Rectangle(6,8);
        shapes[5]=new Square(9);

       for(int i=0;i<8;i++) {
           System.out.println("for: "+shapes[i].toString()+"area:"+shapes[i].getArea()+"  perimeter: "+shapes[i].getPerimeter()+"\n");
       }
}




}
