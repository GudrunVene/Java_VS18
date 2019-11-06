import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {

        int length = text.length();
        String help = "";
        int i = 0;
        while (length > 0){


            char character = text.charAt(text.length()-1-i);
            help = help + character;
            i++;
            length--;

        }
        return help;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }

}
