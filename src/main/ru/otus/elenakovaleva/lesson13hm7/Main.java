package ru.otus.elenakovaleva.lesson13hm7;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Вова", null, 50);
        Moveable car = new Car("Машина", 1000);
        Moveable horse = new Horse("Лошадь", 200);
        Moveable bicycle = new Bicycle("Велосипед");
        Moveable rover = new Rover("Вездеход", 600);

        human.goIn(bicycle);
        human.transfer(20, Area.SWAMP);
        human.transfer(20, Area.PLAIN);
        human.goOut(bicycle);
        human.transfer(20, Area.PLAIN);
        human.goIn(car);
        human.transfer(1200, Area.PLAIN);
        human.transfer(900, Area.PLAIN);
        human.transfer(300, Area.SWAMP);
    }
}
