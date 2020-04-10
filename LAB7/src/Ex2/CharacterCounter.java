package Ex2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharacterCounter  {

    public static void main(String[] args) throws IOException {
        Scanner scanner= new Scanner(System.in);

        try{
            BufferedReader input = new BufferedReader(new FileReader("src/Ex2/data.txt"));
            int counterCharacter = 0;
            int  character;
            System.out.println("which character are you looking for?");
            char c=scanner.nextLine().charAt(0);

              while((character = input.read())!=-1 ){
                if((char)character == c) counterCharacter++;
            }
              System.out.println("number of"+ c + "characters in the file is: "+counterCharacter);
        }catch (FileNotFoundException er) {System.out.println("I/O error"+ er.getMessage());}
        finally {
            System.out.println("Action finished");
        }
    }
}
