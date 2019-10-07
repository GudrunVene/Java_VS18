import java.util.Scanner;
import nhlstats.NHLStatistics;

public class NHL {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.top(10);

        System.out.println("Top 25 players based on penalty amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("Statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("Statistics for Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        /*Statistic seem to be in order of penalty amount. Maybe because i last sorted statistics by penalties.*/

        System.out.println("players in Anaheim Ducks ordered by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");

    }
}