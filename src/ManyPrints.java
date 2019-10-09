import java.util.Scanner;

public class ManyPrints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // ask the user how many times the text should be printed
        System.out.print("How many? ");
        int number = reader.nextInt();
        int i = 1;
        // use the while structure to call the printText method several times
        while (i <= number){
            printText();
            i ++;
        }

    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
