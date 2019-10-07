import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String [] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = reader.nextInt();
        System.out.println();

        int reminder = number % 2;
        if ( reminder > 0){
            System.out.println("Number " + number + " is odd.");
        } else {
            System.out.println("Number " + number + " is even.");
        }
    }


}
