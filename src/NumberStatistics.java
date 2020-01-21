import java.util.ArrayList;

public class NumberStatistics {

    private int amountOfNumbers;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(number);
        amountOfNumbers++;
    }

    public int amountOfNumbers() {
        return amountOfNumbers;
    }



}
