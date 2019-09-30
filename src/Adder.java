import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int firstNumber = reader.nextInt();
        System.out.print("Type another number: ");
        int secondNumber = reader.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.println("Sum of the numbers: " + sum);
    }
}
