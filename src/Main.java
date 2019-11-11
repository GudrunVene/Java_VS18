public class Main {

    public static void main(String[] args) {

        DecreasingCounter counter = new DecreasingCounter(10);
        counter.printValue();

        counter.decrease(9);
        counter.printValue();

        counter.decrease(8);
        counter.printValue();
    }
}
