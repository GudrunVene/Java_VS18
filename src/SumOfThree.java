import java.util.Scanner;

public class SumOfThree {

    public static void main(String [] args){

        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

        System.out.println("Type in first number: ");
        read = reader.nextInt();
        sum = sum + read;
        System.out.println("Type in second number: ");
        read = reader.nextInt();
        sum = sum + read;
        System.out.println("Type in third number: ");
        read = reader.nextInt();
        sum = sum + read;

        System.out.println("Sum: " + sum);
    }
}
