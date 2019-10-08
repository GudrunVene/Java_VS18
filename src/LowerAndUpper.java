import java.util.Scanner;

public class LowerAndUpper {

    public static void main(String [] args){

        Scanner reader = new Scanner(System.in);

        System.out.print("Type a first number: ");
        int firstNumber = reader.nextInt();
        System.out.print("Type a last number: ");
        int lastNumber = reader.nextInt();


        while (true){
            if (firstNumber < lastNumber){
                firstNumber ++;
                System.out.println(firstNumber);
            } else {
                break;
            }
        }
    }
}
