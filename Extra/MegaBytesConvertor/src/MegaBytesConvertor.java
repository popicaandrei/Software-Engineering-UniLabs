public class MegaBytesConvertor {

    public static void printMegaBytesAndKiloBytes(int kyloBytes){
       if(kyloBytes<0) System.out.println("Invalid Value");
       else{ int cat = kyloBytes / 1024;
        int rest = kyloBytes % 1024;

        System.out.println(kyloBytes+ " KB = "+ cat + " MB " + "and "+ rest + " KB ");
    }
    }

}
