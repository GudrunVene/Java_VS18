import java.util.Scanner;

public class ReversingAName {

    public static void main(String args[]){

        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.next();
        int i = 0;

        while (name.length() > 2 && i < name.length()){

            char character = name.charAt(name.length()-i-1);
            i++;
            System.out.print(character);
        }
    }
}
