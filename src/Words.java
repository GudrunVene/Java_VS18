import java.util.ArrayList;
import java.util.Scanner;

public class Words {

    public static void main(String[] args){


        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String enteredWord = reader.nextLine();

        while ( !enteredWord.isEmpty()){
            words.add(enteredWord);
            System.out.print("Type a word: ");
            enteredWord = reader.nextLine();

        }  if ( enteredWord.isEmpty() ) {  // could also be: word.equals("")
            // word was empty, meaning that the user only pressed enter
            System.out.println("You typed the following words: ");
            for (String word : words) {
                System.out.println( word );
            }
        }

    }
}
