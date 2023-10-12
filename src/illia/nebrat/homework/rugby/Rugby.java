package illia.nebrat.homework.rugby;

import java.util.Random;

public class Rugby {
    public static void main(String[] args) {
        Random random = new Random();
        int[] team1Ages = new int[25];
        int[] team2Ages = new int[25];

        int team1TotalAge = 0;
        int team2TotalAge = 0;

        System.out.println("Age of first team players:");
        for (int i = 0; i < 25; i++) {
            team1Ages[i] = random.nextInt(23) + 18;
            System.out.print(team1Ages[i] + " ");
            team1TotalAge += team1Ages[i];
        }

        System.out.println("\n"+"Age of second team players:");
        for (int i = 0; i < 25; i++) {
            team2Ages[i] = random.nextInt(23) + 18;
            System.out.print(team2Ages[i] + " ");
            team2TotalAge += team2Ages[i];
        }

        double team1AverageAge = (double) team1TotalAge / 25;
        double team2AverageAge = (double) team2TotalAge / 25;

        System.out.println("\n\n"+"Average age of first team players: " + team1AverageAge);
        System.out.println("\n"+"Average age of first team players: " + team2AverageAge);
    }
}
