package illia.nebrat.homework.guess;


import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessNumber {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int randomNumber = ThreadLocalRandom.current().nextInt(11);
        int attempts = 3;

        System.out.println("Guess the number from 0 to 10. You have "+ attempts + " attempts to input number.");

        for (int i = 0; i < attempts; i++) {

            System.out.println("Іnput the number:");
            int guessNumber = SCANNER.nextInt();

            if (randomNumber == guessNumber) {
                System.out.println("You guessed the number!Сongratulations! It is " + randomNumber);
                return;
            } else {
                System.out.println("You didn't get the number right!");
            }
        }
        System.out.println("Game over."); }
}
