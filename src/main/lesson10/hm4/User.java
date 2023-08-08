package lesson10.hm4;

public class User {
    private String lastName;
    private String firstName;
    private String patronymic;
    private int yearBirth;
    private String email;

    public int getYearBirth() {
        return yearBirth;
    }

    public User(String lastName, String firstName, String patronymic, int yearBirth, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.yearBirth = yearBirth;
        this.email = email;
    }

    public void printInfo() {
        System.out.println("ФИО: " + lastName + " " + firstName + " " + patronymic +
                "\nГод рождения: " + yearBirth + "\nemail: " + email);
        System.out.println();
    }
}
