import java.util.ArrayList;

public class NumberStatistics {

    private int amountOfNumbers;
    private int sum = 0;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(number);
        amountOfNumbers++;
        this.sum = this.sum + number;
    }

    public int amountOfNumbers() {
        return amountOfNumbers;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        double s = sum;
        double a = amountOfNumbers;
        double avg = s / a;
        return avg;
    }
}


