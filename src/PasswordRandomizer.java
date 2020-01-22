import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class PasswordRandomizer {

    private Random random;
    private int length;


    public PasswordRandomizer(int length) {
        // Format the variable here
        this.length = length;
        random = new Random();
    }

    public String createPassword() {
        // Write the code here which returns the new password

        int i = 0;
        ArrayList<String> pass = new ArrayList<>();
        while (i <= length){
            int number = random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            String s = String.valueOf(symbol);

            pass.add(s);
            i++;
        }
        String joinedString = pass.stream().collect(Collectors.joining());
        return joinedString;



    }
}
