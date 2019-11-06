import java.util.ArrayList;

public class TheLengthsOfTheStrings {

    public static ArrayList<Integer> lengths(ArrayList<String> list) {

        list.size();
        int i = 0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (i < list.size()){
            int number = list.get(i).length();
            numbers.add(number);
            i++;

        }
        return numbers;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);

        System.out.println("The lengths of the Strings: " + lengths);
    }
}
