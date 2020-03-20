package ex1;

public class Robot {
    private int x;

    public Robot(int x) {
        this.x = x;
    }

    public void change(int k){
       if(k>=1) this.x=k;
       else System.out.println("value invalid");
    }

    public String toString() {
        return "Robot{" +
                "x=" + x +
                '}';
    }
}
