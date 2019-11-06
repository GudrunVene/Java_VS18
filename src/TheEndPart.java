import java.util.Scanner;

public class TheEndPart {

    public static void main(String args[]){

        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = reader.next();
        int length = word.length();
        System.out.print("Length of the end part: ");
        int lastChar = reader.nextInt();

        System.out.println(word.substring(length-lastChar,length));
    }
}
