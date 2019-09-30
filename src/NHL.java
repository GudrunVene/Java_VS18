import java.util.Scanner;
import nhlstats.NHLStatistics;

public class NHL {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.top(10);
    }
}