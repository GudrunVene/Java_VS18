import java.util.Random;

public class GuessingNumber {

    public static void main(String args[]) {


        drawNumber(101);

    }

    private static int drawNumber(int max){

        Random random = new Random();
        return random.nextInt(max);

    }

}
