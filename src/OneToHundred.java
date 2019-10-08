import java.util.Scanner;

public class OneToHundred {

    public static void main(String [] args){

        Scanner reader = new Scanner(System.in);
        int number = 1;


        while (number < 101){
            System.out.println(number);
            number ++;
        }
    }
}
