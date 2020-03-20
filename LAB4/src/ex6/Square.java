package ex6;

public class Square extends Rectangular {
    public Square(){
    }

    public Square(double side) {
         super(side, side);
    }

    public void setSide(double side )
    {
        setLenght(side);
        setWidth(side);
    }

    public double getSide(){
        return getWidth();//sau getLenght();
    }


    @Override
    public String toString() {
        return "Square with side"+ getWidth()+"subclass bla bla" + toString();
    }

    @Override
    public void setLenght(double side) {
        super.setLenght(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }
}
