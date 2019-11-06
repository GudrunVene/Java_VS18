import java.util.ArrayList;
import java.lang.Math;

public class Variance {

    public static double variance(ArrayList<Integer> list) {

        double avg = average(list);
        //  ((3 - 3.5)² + (2 - 3.5)² + (7 - 3.5)² + (2 - 3.5)²)/(4 - 1) ? 5,666667
        double sum = 0;
        int i = 0;
        while ( i < list.size() ){
            sum = sum +   ( Math.abs(list.get( i )  - avg) * Math.abs(list.get( i )  - avg) );
            i++;
        }

        double variance = sum /  (list.size()-1);
        return variance;
    }


    public static double average(ArrayList<Integer> list) {

        int sum = 0;
        int i = 0;
        while ( i < list.size()){

            sum = sum + list.get(i);
            i++;
        }
        double sumDouble = sum;
        double iDouble = i;
        double average = sumDouble / iDouble;
        return average;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }
}
