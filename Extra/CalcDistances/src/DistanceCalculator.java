public class DistanceCalculator {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet < 0 || (inches > 12 || inches <0)) return -1;
        double centimeters;
        centimeters = inches * 2.54 + 12;
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches <0 ) return -1;
        double feet= (int)inches/12;
        double rest = (int)inches % 12;
        return calcFeetAndInchesToCentimeters(feet,rest);
    }

    public static void main(String[] args) {

    }
}
