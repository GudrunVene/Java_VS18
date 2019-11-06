import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args){

        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String enteredWord = reader.nextLine();

        while ( !enteredWord.isEmpty()){
            words.add(enteredWord);
            System.out.print("Type a word: ");
            enteredWord = reader.nextLine();

        }  if ( enteredWord.isEmpty() ) {
            Collections.sort(words);
            System.out.println("You typed the following words: ");
            for (String word : words) {
                System.out.println( word );
            }
        }
    }
}
