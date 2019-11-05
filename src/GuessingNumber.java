import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {

    public static void main(String args[]) {

        int numberForGuessing = drawNumber();

        Scanner reader = new Scanner(System.in);

        int i = 0;
        boolean win = false;

        while (win == false) {

            System.out.print("Guess a number: ");
            int guessedNumber = reader.nextInt();

            if (guessedNumber > 100 | guessedNumber < 0) {
                System.out.println("Guess a number between 0 and 100");
            }
            else if (guessedNumber > numberForGuessing) {
                i++;
                System.out.println("The number is lesser, guesses made: " + i);
            } else if (guessedNumber < numberForGuessing) {
                i++;
                System.out.println("The number is greater, guesses made: " + i);
            } else if (guessedNumber == numberForGuessing) {
                win = true;
            }
        }
        System.out.println("Congratulations, your guess is correct!");

    }

    private static int drawNumber(){

        Random random = new Random();
        int numberToGuess = random.nextInt(100);
        /*System.out.println(numberToGuess);*/
        return numberToGuess;
    }

}
