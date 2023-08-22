package ru.otus.elenakovaleva.lesson13hm7;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Вова", null, 50);
        Moveable car = new Car("Машина", 1000);
        Moveable horse = new Horse("Лошадь",100);
        Moveable bicycle = new Bicycle("Велосипед");
        Moveable rover = new Rover("Вездеход", 500);

        human.goIn(bicycle);
        human.transfer(20, Area.PLAIN, bicycle, human);
        human.transfer(100, Area.FOREST, rover, human);
        human.goOut(bicycle);
        human.transfer(100, Area.FOREST, rover, human);
        human.goIn(rover);
        human.transfer(100, Area.FOREST, rover, human);
    }
}
