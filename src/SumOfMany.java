import java.util.Scanner;

public class SumOfMany {

    public static void main(String [] args){

        Scanner reader = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Type a number: ");

            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            } else {
                sum = sum + read;
            }

            System.out.println("Sum now: " + sum);
        }

        System.out.println("Sum in the end: " + sum);
    }
}

