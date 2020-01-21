public class BoundedCounter {

    private int value = 0;
    private int upperLimit;

    public BoundedCounter (int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void next() {
        this.value ++;
        if (this.value > upperLimit) {
            this.value = 0;
        }

    }

    public String toString() {

        if (this.value < 10) {

            return "0" + this.value;
        } else return "" + this.value;
    }


    public int getValue() {
        return this.value;
    }

}
