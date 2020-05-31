import speed.converter.SpeedConverter;

public class Main {
    public static void main(String[] args) {
        double miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("primul input "+miles+"\n");
        SpeedConverter.printConversion(10.5);
    }
}
