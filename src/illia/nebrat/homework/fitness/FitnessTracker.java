package illia.nebrat.homework.fitness;

public class FitnessTracker {
    private  String firstName;
    private String lastName;
    private String email;
    private String phone;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private double weight;
    private String bloodPressure;
    private int stepsPerDay;
    private int age;

    public FitnessTracker(String firstName, String lastName, String email, String phone, int dayOfBirth, int monthOfBirth, int yearOfBirth, double weight, String bloodPressure, int stepsPerDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.stepsPerDay = stepsPerDay;

        age = 2023 - yearOfBirth;
    }

    public void printAccountInfo() {
        System.out.println("Name: " + getFirstName());
        System.out.println("Lastname: " + getLastName());
        System.out.println("Date of birth: " + getDayOfBirth() + "." + getMonthOfBirth() + "." + getYearOfBirth());
        System.out.println("Age: " + getAge() + " years");
        System.out.println("Email: " + getEmail());
        System.out.println("Phone number: " + getPhone());
        System.out.println("Weight: " + getWeight() + " kg");
        System.out.println("Тиск: " + getBloodPressure());
        System.out.println("Steps per day: " + getStepsPerDay() + " steps \n\n");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getStepsPerDay() {
        return stepsPerDay;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

    public int getAge() {
        return age;
    }
}


