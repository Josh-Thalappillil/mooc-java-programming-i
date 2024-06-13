import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("File: ");
        String file = scan.nextLine();

        System.out.print("Team: ");
        String team = scan.nextLine();

        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);

                if (homeTeam.equals(team) || visitingTeam.equals(team)) {
                    gamesPlayed++;
                    if (homeTeam.equals(team) && homePoints > visitingPoints) {
                        wins++;
                    } else if (visitingTeam.equals(team) && visitingPoints > homePoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading the file " + file + ": " + e.getMessage());
        }

        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
