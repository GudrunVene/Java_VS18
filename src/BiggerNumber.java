import java.util.Scanner;

public class BiggerNumber {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int firstNumber = reader.nextInt();
        System.out.print("Type another number: ");
        int secondNumber = reader.nextInt();
        // suurem number on maximum number valikust
        int biggerNumber = Math.max(firstNumber, secondNumber);

        System.out.println("The bigger number of the two numbers given was: " + biggerNumber);
    }
}
