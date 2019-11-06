import java.util.Scanner;

public class Palindrome {


    public static boolean palindrome(String text) {

        int length = text.length();
        String help = "";
        int i = 0;
        while (length > 0){


            char character = text.charAt(text.length()-1-i);
            help = help + character;
            i++;
            length--;

        }

        if (text.contains(help)){
            return true;
        }
        else
            return false;

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
