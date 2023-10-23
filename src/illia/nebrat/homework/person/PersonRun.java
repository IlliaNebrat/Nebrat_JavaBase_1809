package illia.nebrat.homework.person;

public class PersonRun {
    public static void main(String[] args) {
        Person firstPerson = new Person("Will", "Smith", "New York", "2936729462846");
        Person secondPerson = new Person("Jackie", "Chan", "Shanghai", "12312412412");
        Person thirdPerson = new Person("Sherlock", "Holmes", "London", "37742123513");

        System.out.println(firstPerson.personInfo());
        System.out.println(secondPerson.personInfo());
        System.out.println(thirdPerson.personInfo());
    }
}
