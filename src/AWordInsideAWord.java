import java.util.Scanner;

public class AWordInsideAWord {

    public static void main(String args[]){

        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String firstWord = reader.next();
        System.out.print("Type the second word: ");
        String secondWord = reader.next();
        int index = firstWord.indexOf(secondWord);

        if (index >0){
            System.out.println("The word '" + secondWord + "' is found in the word '" + firstWord + "'");
        } else if (index == -1){
            System.out.println("The word '" + secondWord + "' is not found in the word '" + firstWord + "'");
        }

    }
}
