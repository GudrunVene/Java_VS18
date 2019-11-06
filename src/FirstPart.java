import java.util.Scanner;

public class FirstPart {

    public static void main(String args[]){

        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = reader.next();
        System.out.print("Length of the first part: ");
        int lastChar = reader.nextInt();

        System.out.println(word.substring(0,lastChar));
    }
}
