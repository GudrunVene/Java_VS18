import java.util.Scanner;

public class FirstCharacter {

    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.next();

        char firstChar = firstCharacter(name);
        System.out.println("First character: " + firstChar);
    }

    public static char firstCharacter(String text){
        char character = text.charAt(0);
        return character;
    }
}
