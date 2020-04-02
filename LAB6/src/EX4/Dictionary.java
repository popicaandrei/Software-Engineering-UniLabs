package EX4;

import java.util.HashMap;

public class Dictionary {

    HashMap<Word,Definition> dictionary = new HashMap<>();


    public void addWord(Word w, Definition d)
    {
        if(dictionary.containsKey(w)) {System.out.println("Cuvantul este deja existent"); return;}
        dictionary.put(w,d);
    }

    public String getDefinition(Word w){
        return dictionary.get(w).getDescription();
    }

     public void getAllWords(){
        System.out.println("The words are:");
        for(Word i:dictionary.keySet()) {
            System.out.println(i.getName());
        }
     }

     public void getAllDefinitions(){
         System.out.println("the definitions are: ");
         for(Word i:dictionary.keySet()){
             System.out.println(dictionary.get(i).getDescription());
         }
     }

    public HashMap<Word, Definition> getHashMap() {
        return (this.dictionary);
    }
}
