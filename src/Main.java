import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics statsAll = new NumberStatistics();
        NumberStatistics statsEven = new NumberStatistics();
        NumberStatistics statsOdd = new NumberStatistics();

        while (true) {
            System.out.print("Type numbers: ");
            int number = Integer.parseInt(reader.nextLine());
            if (number != -1) {
                statsAll.addNumber(number);
                if (number % 2 == 0){
                    statsEven.addNumber(number);
                } else if (number % 2 != 0){
                    statsOdd.addNumber(number);
                }
            } else if (number == -1) {
                System.out.println("sum: " + statsAll.sum());
                System.out.println("sum of even : " + statsEven.sum());
                System.out.println("sum of odd: " + statsOdd.sum());
                break;

            }
        }


    }
}
