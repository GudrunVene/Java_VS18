import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // Write the number drawing here using the method containsNumber()
        random = new Random();
        int i = 0;
        while (i <= 7 ){
            int number = random.nextInt(39);
            containsNumber(number);
            if (containsNumber(number) != true){
                numbers.add(number);
            }
            i++;
        }

    }

    public boolean containsNumber(int number) {
        // Test here if the number is already among the drawn numbers
        if (numbers.contains(number)){
            return true;
        }
        else return false;
    }


}
