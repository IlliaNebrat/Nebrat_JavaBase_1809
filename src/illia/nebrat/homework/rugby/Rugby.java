package illia.nebrat.homework.rugby;

import java.util.Random;

public class Rugby {
    public static void main(String[] args) {
        int[] firstTeamAges = new int[25];
        int[] secondTeamAges = new int[25];

        int firstTeamTotalAge = fillArrayRandomAges(firstTeamAges);
        int secondTeamTotalAge = fillArrayRandomAges(secondTeamAges);

        System.out.println("Вік гравців першої команди:");
        printArray(firstTeamAges);
        System.out.println("\n\nВік гравців другої команди:");
        printArray(secondTeamAges);

        double firstTeamAverageAge = (double) firstTeamTotalAge / firstTeamAges.length;
        double secondTeamAverageAge = (double) secondTeamTotalAge / secondTeamAges.length;

        System.out.println("\n\nСередній вік гравців першої команди: " + firstTeamAverageAge);
        System.out.println("Середній вік гравців другої команди: " + secondTeamAverageAge);
    }

    public static int fillArrayRandomAges(int[] array) {
        Random random = new Random();
        int totalAge = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(23) + 18;
            totalAge += array[i];
        }

        return totalAge;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
