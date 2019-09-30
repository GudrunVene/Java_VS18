import java.util.Scanner;

public class AgesSum {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String firstName = reader.next();
        System.out.print("Type your age: ");
        int firstAge = reader.nextInt();
        System.out.println();

        System.out.print("Type your name: ");
        String secondName = reader.next();
        System.out.print("Type your age: ");
        int secondAge = reader.nextInt();
        System.out.println();

        int total = firstAge + secondAge;

        System.out.println(firstName + " and " + secondName + " are " + total + " years old in total.");
    }
}
