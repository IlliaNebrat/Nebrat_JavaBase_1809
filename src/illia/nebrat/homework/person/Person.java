package illia.nebrat.homework.person;

public class Person {
    private final String name;
    private final String surname;
    private final String city;
    private final String phone;

    public Person(String name, String surname, String city, String phone) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phone = phone;
    }

    public String personInfo() {
        return "Citizen " + name + " " + surname + " from " + city + " can be called at " + phone + ".";
    }
}
