import java.util.Scanner;

public class SumOfSet {

    public static void main(String [] args){

        Scanner reader = new Scanner(System.in);

        System.out.print("Until what? ");
        int lastNumber = reader.nextInt();
        int i = 1;
        int sum = 0;
        sum = sum + i;

        while (i < lastNumber){

            i ++;
            sum = sum + i;
        }
        System.out.println("Sum is " + sum);
    }
}
