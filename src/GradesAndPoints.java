import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String [] args){

        Scanner reader = new Scanner(System.in);

        System.out.print("Type the points [0-60]: ");
        int number = reader.nextInt();
        System.out.println();

        if ( number >= 0  && number <= 29 ) {
            System.out.println("failed");
        } else if (number >= 30  && number <= 34){
            System.out.println("Grade: 1");
        } else if (number >= 35  && number <= 39){
            System.out.println("Grade: 2");
        } else if (number >= 40  && number <= 44){
            System.out.println("Grade: 3");
        } else if (number >= 45  && number <= 49){
            System.out.println("Grade: 4");
        } else if (number >= 50){
            System.out.println("Grade: 5");
        }
    }
}
