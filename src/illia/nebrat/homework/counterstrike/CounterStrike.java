package illia.nebrat.homework.counterstrike;

import java.util.Scanner;

public class CounterStrike {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Input the name of the terrorist team:");
        String terroristsName = SCANNER.nextLine();
        System.out.println("Input frags value of first terrorist");
        int terrorist1 = SCANNER.nextInt();
        System.out.println("Input frags value of second terrorist");
        int terrorist2 = SCANNER.nextInt();
        System.out.println("Input frags value of third terrorist");
        int terrorist3 = SCANNER.nextInt();
        System.out.println("Input frags value of fourth terrorist");
        int terrorist4 = SCANNER.nextInt();
        System.out.println("Input frags value of fifth terrorist");
        int terrorist5 = SCANNER.nextInt();

        SCANNER.nextLine();

        System.out.println("Input the name of the counter-terrorist team:");
        String counterTerroristsName = SCANNER.nextLine();
        System.out.println("Input frags value of first counter-terrorist");
        int counterTerrorist1 = SCANNER.nextInt();
        System.out.println("Input frags value of second counter-terrorist");
        int counterTerrorist2 = SCANNER.nextInt();
        System.out.println("Input frags value of third counter-terrorist");
        int counterTerrorist3 = SCANNER.nextInt();
        System.out.println("Input frags value of fourth counter-terrorist");
        int counterTerrorist4 = SCANNER.nextInt();
        System.out.println("Input frags value of fifth counter-terrorist");
        int counterTerrorist5 = SCANNER.nextInt();

        double terroristsAverageFrags = (terrorist1 + terrorist2 + terrorist3 + terrorist4 + terrorist5) / 5.0;
        double counterTerroristsAverageFrags = (counterTerrorist1 + counterTerrorist2 + counterTerrorist3 + counterTerrorist4 + counterTerrorist5) / 5.0;

        if (terroristsAverageFrags > counterTerroristsAverageFrags) {
            System.out.println("Terrorists win! Сongratulations to " + terroristsName +  "!" + " Average team score = " + terroristsAverageFrags  + " frags" );
        } else if (counterTerroristsAverageFrags > terroristsAverageFrags) {
            System.out.println("Counter-terrorists win! Сongratulations to " + counterTerroristsName + "!" + " Average team score = " + counterTerroristsAverageFrags + " frags" );
        } else {
            System.out.println("Draw! Average score of both teams =  " + terroristsAverageFrags + " frags");
        }
    }
}
