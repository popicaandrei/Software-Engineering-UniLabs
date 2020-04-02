package EX4;

import java.util.Scanner;


public class TestDictionary {

    public static void printMenu(){
        System.out.println("1.Add words in dictionary!");
        System.out.println("2.Find a definition for a word!");
        System.out.println("3.Show all the words");
        System.out.println("4.Show all the definitions");
        System.out.println("5.Show dictionary");
        System.out.println("6.Show the menu");
        System.out.println("7.Exit");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            printMenu();
            int choose = scanner.nextInt();

            Dictionary dictionary = new Dictionary();
            switch (choose) {
                case 1:{
                    System.out.println("how many words do you want to add?");
                    int numberOfWords = scanner.nextInt();

                    while (numberOfWords > 0) {
                        System.out.println("insert word:"); String w = scanner.nextLine();
                        scanner.nextLine();
                        System.out.println("insert description: ");String d = scanner.nextLine();
                        dictionary.addWord(new Word(w), new Definition(d));
                        System.out.println("---------");
                        numberOfWords--;
                    }
                    break;
                }

                case 2:
                      {   System.out.println("insert the word u want to search: ");
                          Word word = new Word(scanner.nextLine());
                          scanner.nextLine();
                          System.out.println(dictionary.getDefinition(word));
                          break;}

                case 3: {dictionary.getAllWords();break;}
                case 4: {dictionary.getAllDefinitions();break;}
                case 5: {dictionary.getHashMap();break;}
                case 6: flag = true;
                case 7: flag=false;
            }

        }


    }
}
