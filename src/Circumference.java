import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the radius: ");
        int radius = reader.nextInt();
        // ümbermõõt
        double circumference = 2 * Math.PI * radius;

        System.out.println("Circumference of the circle: " + circumference);
    }
}
