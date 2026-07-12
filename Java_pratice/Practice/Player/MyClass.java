package Practice.Player;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MyClass {

    public static int findPlayerWithLowestRuns(List<Player> players, String value) {

//        return players.stream().filter(p -> p.getPlayerType().equalsIgnoreCase(value))
//                .min((p1, p2) -> Integer.compare(p1.getRuns(), p2.getRuns()))
//                .map(p -> p.getRuns())
//                .orElse(0);

        return players.stream().filter(p -> p.getPlayerType().equalsIgnoreCase(value))
                .min(Comparator.comparingInt(p -> p.getRuns()))
                .map(p -> p.getRuns())
                .orElse(0);
    }


    public static List<Player> findPlayerByMatchType(List<Player> players, String value) {

        return players.stream().filter(p -> p.getMatchType().equalsIgnoreCase(value))
                .collect(Collectors.toList()).reversed();
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        for(int j = 0; j < 2; j++){
            List<Player> players = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                int playerId = sc.nextInt();
                sc.nextLine();
                String name = sc.nextLine();
                int runs = sc.nextInt();
                sc.nextLine();
                String pType = sc.nextLine();
                String mType = sc.nextLine();
                players.add(new Player(playerId, name, runs, pType, mType));
            }

            String playerType = sc.nextLine();
            String matchType = sc.nextLine();

//            for (Player p : players) System.out.println(p.toString());

            int lowestScore = findPlayerWithLowestRuns(players, playerType);
            if (lowestScore > 0) System.out.println(lowestScore);
            else System.out.println("No such player");

            List<Player> playersInMatchType = findPlayerByMatchType(players, matchType);
            if (playersInMatchType.isEmpty()) System.out.println("There ois no such in the match Type");
            else for (Player i : playersInMatchType) System.out.println(i.getPlayerId());

        }
    }
}
