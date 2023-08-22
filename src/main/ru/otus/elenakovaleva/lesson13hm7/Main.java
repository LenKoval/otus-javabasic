package ru.otus.elenakovaleva.lesson13hm7;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Вова", null, 50);
        Moveable car = new Car("Машина", 1000);
        Moveable bicycle = new Bicycle("Велосипед");

        human.goIn(bicycle);
        human.transfer(20, Area.SWAMP, bicycle, human);
        human.transfer(20, Area.PLAIN, null, human);
        human.goOut(bicycle);
        human.transfer(20, Area.PLAIN, null, human);
        human.goIn(car);
        human.transfer(1200, Area.PLAIN, car, human);
    }
}
