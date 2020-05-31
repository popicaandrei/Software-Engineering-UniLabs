package paint.job;

public class PaintJob {

    public static int getBucketCount(double width,double height,double areaPerBucket, int extraBuckets){

        /*reading the parameters as inputs
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the width of the wall: ");
        width=scanner.nextDouble();
        scanner.nextLine();

        System.out.println("enter the height of the wall: ");
        height = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("enter the area covered: ");
        areaPerBucket = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("enter the extra buckets: ");
        extraBuckets = scanner.nextInt();
        scanner.nextLine();
        scanner.close();*/

        if(areaPerBucket<=0 || height <=0 || width<=0 || extraBuckets<0) return -1;

        double remaining=(width*height)- (extraBuckets*areaPerBucket);
        double bucketsNedeed = Math.ceil(remaining/areaPerBucket);
        return (int)bucketsNedeed;
    }


    public static int getBucketCount(double width,double height,double areaPerBucket ){

        if(areaPerBucket<=0 || height <=0 || width<=0) return -1;
        double bucketsNedeed = Math.ceil((width*height)/areaPerBucket);
        return (int)bucketsNedeed;
    }

    public static int getBucketCount(double area,double areaPerBucket ){

        if(areaPerBucket<=0 || area<=0) return -1;
        double bucketsNedeed = Math.ceil(area/areaPerBucket);
        return (int)bucketsNedeed;
    }


    public static void main(String[] args) {

        //overloading the functions
        int toPrint1 = getBucketCount(3.4,2.1,1.5,2);
        int toPrint2 = getBucketCount(3.4,2.1,1.5);
        int toPrint3 = getBucketCount(3.4,1.5);

        System.out.println("first function "+toPrint2+"\n");
        System.out.println("second function " + toPrint2+"\n");
        System.out.println("third function" + toPrint3+"\n");
    }
}
