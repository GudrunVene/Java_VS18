public class Multiplier {

    private int number;



    public Multiplier(int numberThatMultiplies){

        this.number = numberThatMultiplies;
    }

    public int multiply(int otherNumber){

        int multiplied = this.number * otherNumber;
        return multiplied;
    }
}
