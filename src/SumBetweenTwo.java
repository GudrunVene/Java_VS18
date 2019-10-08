import java.util.Scanner;

public class SumBetweenTwo {

    public static void main(String [] args){

        Scanner reader = new Scanner(System.in);

        System.out.print("Type a first number: ");
        int firstNumber = reader.nextInt();
        System.out.print("Type a last number: ");
        int lastNumber = reader.nextInt();
        int sum = 0;

        while (firstNumber <= lastNumber){
            sum = sum + firstNumber;
           firstNumber ++;
        }
        System.out.println("Sum is " + sum);
    }
}
