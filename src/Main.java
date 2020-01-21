import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();

        while (true) {
            System.out.print("Type numbers: ");
            int number = Integer.parseInt(reader.nextLine());
            if (number != -1) {
                stats.addNumber(number);
            } else if (number == -1) {
                System.out.println("Amount: " + stats.amountOfNumbers());
                System.out.println("sum: " + stats.sum());
                System.out.println("average: " + stats.average());
                break;

            }
        }


    }
}
