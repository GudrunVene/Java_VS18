import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PasswordRandomizer randomizer = new PasswordRandomizer(13);
        System.out.println("Password 1: " + randomizer.createPassword());
        System.out.println("Password 2: " + randomizer.createPassword());
        System.out.println("Password 3: " + randomizer.createPassword());
        System.out.println("Password 4: " + randomizer.createPassword());


    }
}
