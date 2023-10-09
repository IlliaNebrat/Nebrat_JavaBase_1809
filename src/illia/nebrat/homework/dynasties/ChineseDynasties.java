package illia.nebrat.homework.dynasties;

public class ChineseDynasties {
    public static void main(String[] args) {

        int liWarrior = 13;
        int liArcher = 24;
        int liCavalry = 46;
        int liUnitNumber = 860;

        float minSuperiority = 1.5F;

        int minWarrior = 9;
        int minArcher = 35;
        int minCavalry = 12;
        int minUnitNumber = (int) (liUnitNumber * minSuperiority);

        int liOverallAttackPower = (liWarrior + liArcher + liCavalry) * liUnitNumber;
        int minOverallAttackPower = (minWarrior + minArcher + minCavalry) * minUnitNumber;

        System.out.println("Overall Attack Power of Li dynasty = " + liOverallAttackPower);
        System.out.print("Overall Attack Power of Min dynasty = " + minOverallAttackPower );

    }
}
