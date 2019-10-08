import java.util.Scanner;

public class NHLStatistics {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");
        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                // print the top ten playes sorted by points
                System.out.println("Top ten by points");
                nhlstats.NHLStatistics.sortByPoints();
                nhlstats.NHLStatistics.top(10);
            } else if (command.equals("goals")) {
                // print the top ten players sorted by goals
                System.out.println("Top ten by goals");
                nhlstats.NHLStatistics.sortByGoals();
                nhlstats.NHLStatistics.top(10);
            } else if (command.equals("assists")) {
                // print the top ten players sorted by assists
                System.out.println("Top ten by assists");
                nhlstats.NHLStatistics.sortByAssists();
                nhlstats.NHLStatistics.top(10);
            } else if (command.equals("penalties")) {
                // print the top ten players sorted by penalties
                System.out.println("Top ten by penalties");
                nhlstats.NHLStatistics.sortByPenalties();
                nhlstats.NHLStatistics.top(10);
            } else if (command.equals("player")) {
                // ask the user for the player name and print the statistics for that player
                System.out.println("Type player name: ");
                String playerName = reader.nextLine();
                System.out.println(playerName);
                nhlstats.NHLStatistics.searchByPlayer(playerName);
            } else if (command.equals("club")) {
                // ask the user for the club abbreviation and print the statistics for the club
                System.out.println("Type club abbreviation: ");
                String team = reader.nextLine();
                // note: the statistics should be sorted by points
                System.out.println("Players in " + team +" ordered by points");
                nhlstats.NHLStatistics.sortByPoints();
                nhlstats.NHLStatistics.teamStatistics(team);
                //     (players with the most points are first)
            }
        }
    }
}
