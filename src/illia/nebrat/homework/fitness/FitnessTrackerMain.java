package illia.nebrat.homework.fitness;

public class FitnessTrackerMain {
    public static void main(String[] args) {
        FitnessTracker firstUser = new FitnessTracker("Іван", "Іванов", "ivanov@example.com", "+380123456789", 1, 1, 1990, 80.5, "120/80", 10000);
        firstUser.printAccountInfo();

        FitnessTracker secondUser = new FitnessTracker("Петро", "Петров", "petrov@example.com", "+380987654321", 15, 5, 1985, 75.0, "130/90", 5000);
        secondUser.printAccountInfo();

        FitnessTracker thirdUser = new FitnessTracker("Степан", "Степанов", "stepan@example.com", "+380111111111", 31, 12, 2000, 60.0, "110/70", 8000);
        thirdUser.printAccountInfo();


        firstUser.setStepsPerDay(15000);
        firstUser.setWeight(78.0);
        firstUser.printAccountInfo();


        secondUser.setBloodPressure("140/90");
        secondUser.printAccountInfo();
    }
}