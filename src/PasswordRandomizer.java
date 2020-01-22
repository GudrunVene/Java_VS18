import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class PasswordRandomizer {

    private Random random;
    private int length;
    ArrayList<String> pass = new ArrayList<>();

    public PasswordRandomizer(int length) {
        // Format the variable here
        this.length = length;
        random = new Random();
    }

    public String createPassword() {
        // Write the code here which returns the new password

        
        while (length > 0){
            int number = random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            String s = String.valueOf(symbol);

            pass.add(s);
            length--;
        }
        String joinedString = pass.stream().collect(Collectors.joining());
        System.out.println("joined " + joinedString);
        return joinedString;


    }
}
