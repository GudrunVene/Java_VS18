import java.util.Scanner;

public class GreaterNumber {

    public static void main(String [] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Type a first number: ");
        int firstNumber = reader.nextInt();
        System.out.print("Type a second number: ");
        int secondNumber = reader.nextInt();
        System.out.println();

        if (firstNumber > secondNumber) {
            System.out.println("Greater number: " + firstNumber);
        } else if (firstNumber < secondNumber){
            System.out.println("Greater number: " + secondNumber);
        } else if (firstNumber == secondNumber){
            System.out.println("The numbers are equal!");
        }

    }
}
