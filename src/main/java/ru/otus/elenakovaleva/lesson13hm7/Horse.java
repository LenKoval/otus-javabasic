package ru.otus.elenakovaleva.lesson13hm7;

public class Horse implements Moveable {
    private String name;
    private int power;

    public Horse(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public void move(int distance, Area area, Human human) {
        if (Area.SWAMP.equals(area)) {
            System.out.println("Лошадь не передвигается по заданной местности.");
        }
        if (power >= distance) {
            power -= distance;
            System.out.println(human.getName() + " проехал по " + area.toString() + " на " + name + " расстояние " +
                    distance + " сил осталось " + power);
        } else {
            System.out.println(name + " не осталось сил.");
        }
    }

    @Override
    public String toString() {
        return name + " сил осталось " + power;
    }
}
