import java.util.Scanner;

public class LeapYear {

    public static void main(String [] args){

        Scanner reader = new Scanner(System.in);

        System.out.print("Type a year: ");
        int year = reader.nextInt();
        System.out.println();

        int firstCondition = year % 4;
        int secondCondition = year % 100;
        int thirdCondition = year % 400;
        if (firstCondition == 0 && secondCondition != 0 || secondCondition == 0 && thirdCondition == 0 ){
            System.out.println("The year is a leap year.");
        }  else {
            System.out.println("The year is not a leap year.");
        }
    }
}
