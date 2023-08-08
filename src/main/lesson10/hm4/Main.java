package lesson10.hm4;

public class Main {
    public static void main(String[] args) {
        User[] users = {
                new User("Иванов", "Иван", "Иванович", 2000, "em@web.com"),
                new User("Петров", "Владимир", "Алексеевич", 1979, "pet@web.com"),
                new User("Сидорова", "Мария", "Дмитриевна", 1991, "mar2@web.com"),
                new User("Никифоров", "Федор", "Михайлович", 1988, "fedor10@web.com"),
                new User("Абрамова", "Надежда", "Александровна", 1967, "abr67@web.com")
        };

        for (int i = 0; i < users.length; i++) {
            if (users[i].getYearBirth() < 1982) {
                users[i].printInfo();
            }
        }
    }
}
