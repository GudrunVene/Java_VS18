import java.util.Scanner;

public class SeparateingCharacters {

    public static void main(String args[]){

        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.next();
        int i = 0;

        while (name.length() > 2 && i < name.length()){
            i++;
            char character = name.charAt(i-1);
            System.out.println((i) +". character: " + character);
        }
    }
}
