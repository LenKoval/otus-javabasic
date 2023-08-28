package ru.otus.elenakovaleva.lesson11hm5;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Kuzya", 4, 0, 1000, 0);
        Animal dog = new Dog("Black", 3, 2, 2000, 2);
        Animal horse = new Horse("Plotva", 6, 3, 5000, 4);
        horse.info();
        horse.run(500);
        horse.swim(1000);
        horse.info();
        horse.run(500);
        horse.info();
    }

}
