package illia.nebrat.homework.lottery;

import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        int[] lotteryNumbers = new int[7];
        int[] playerNumbers = new int[7];
        Random random = new Random();

        for (int i = 0; i < 7; i++) {
            lotteryNumbers[i] = random.nextInt(10);
            playerNumbers[i] = random.nextInt(10);
        }

        sort(lotteryNumbers);
        sort(playerNumbers);

        System.out.println(java.util.Arrays.toString(lotteryNumbers));
        System.out.println(java.util.Arrays.toString(playerNumbers));

        int matches = 0;
        for (int i = 0; i < 7; i++) {
            if (lotteryNumbers[i] == playerNumbers[i]) {
                matches++;
            }
        }

        System.out.println("Matches: " + matches);
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
