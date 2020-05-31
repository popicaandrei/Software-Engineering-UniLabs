import java.util.Scanner;

public class Reverse {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        int number=0;
        number = scanner.nextInt();
        int array[] = new int[number];
        readArray(array,number);
        printArray(array,number);
        reverseArray(array,number);

        printArray(reverseArray(array,number),number);
    }

    public static void readArray(int array[],int number){
         for(int i=0;i<number;i++)  array[i]=scanner.nextInt();
    }

    public static int[] reverseArray(int[] array,int number){
        int[] copyArray=new int[number];
        for(int i=0;i<number;i++)
            copyArray[i] = array[number-i-1];
        return copyArray;
    }

    public static void printArray(int[]array,int number)
    {
        for(int i=0;i<number;i++)
        {
            System.out.println(array[i]+" ");
        }
    }

}
