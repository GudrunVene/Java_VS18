import java.util.Scanner;

public class ReadingNumbers {

    public static void main(String [] args){

        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = reader.nextInt();

        while (number != -1){
            System.out.println(number);
            number = reader.nextInt();
        }
        System.out.println("Thank you and see you later!");
    }
}
