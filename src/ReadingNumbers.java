import java.util.Scanner;


public class ReadingNumbers {

    public static void main(String [] args){

        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = reader.nextInt();
        int sum = 0;
        int i = 0;
        double average = 0;

        while (number != -1){
            sum = sum + number;
            System.out.println(number);
            number = reader.nextInt();
            i ++;
        }
        double sumDouble = sum;
        double iDouble = i;
        average = sumDouble / iDouble;
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + i);
        System.out.println("Average: " + average);
    }
}
