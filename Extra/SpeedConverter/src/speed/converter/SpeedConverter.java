package speed.converter;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour)
    {
        if(kilometersPerHour < 0) return -1;
        else{
         long milesPerHour=Math.round(kilometersPerHour/ 1.609);
         return milesPerHour;
        }
    }

    public static void printConversion(double kilometersPerHour) {

        long milesPerHour=toMilesPerHour(kilometersPerHour);
        if(milesPerHour == -1) System.out.println("invalid");
            else System.out.println(kilometersPerHour+ "km/h= " + milesPerHour + "mi/h" );
    }

}
