import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args){

        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String enteredWord = reader.nextLine();


        while ( !enteredWord.isEmpty() && !words.contains(enteredWord)){
            words.add(enteredWord);
            System.out.print("Type a word: ");
            enteredWord = reader.nextLine();

        }

        if ( words.contains(enteredWord) ) {

            System.out.println("You gave the word " + enteredWord + " twice.");
        }
    }
}
