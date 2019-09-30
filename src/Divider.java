import java.util.Scanner;

public class Divider {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int firstNumber = reader.nextInt();
        System.out.print("Type another number: ");
        int secondNumber = reader.nextInt();

        int division = firstNumber / secondNumber;

        System.out.println("Division of the numbers: " + division);
    }
}
