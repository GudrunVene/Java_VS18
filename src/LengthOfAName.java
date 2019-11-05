import java.util.Scanner;

public class LengthOfAName {

    public static void main(String args[]) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.next();
        int lengthOfName = calculateCharacters(name);


        System.out.println("Number of characters: " + lengthOfName);
    }

    public static int calculateCharacters(String text) {

        int length = text.length();
        return length;
    }
}
