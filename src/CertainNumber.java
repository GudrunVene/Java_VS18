import java.util.Scanner;

public class CertainNumber {

    public static void main(String [] args){

        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int userNumber = reader.nextInt();
        System.out.println();
        int number = 1;

        while (number <= userNumber){
            System.out.println(number);
            number ++;
        }
    }
}
