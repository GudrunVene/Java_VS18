public class DecreasingCounter {

    private int value;   // object variable that remembers the value of the counter

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease(int valueAtStart) {
        // write here the code that decrements the value of counter by one
        this.value = valueAtStart;
        int decreased = valueAtStart --;
        return;
    }

    // and here the rest of the methods
}
