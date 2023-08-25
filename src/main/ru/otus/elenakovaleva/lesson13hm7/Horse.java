package ru.otus.elenakovaleva.lesson13hm7;

public class Horse implements Moveable {
    private String name;
    private int power;
    private static final Area[] areas = {Area.SWAMP};

    public Horse(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public boolean move(int distance, Area area, Human human) {
        for (int i = 0; i < areas.length; i++) {
            if (areas[i] == area) {
                System.out.println(name + " не передвигается по заданной местности.");
                return false;
            }
        }
        if (power < distance) {
            System.out.println(name + " не хватает сил.");
            return false;
        }
        power -= distance;
        System.out.println(human.getName() + " проехал по " + area.toString() + " на " + name + " расстояние" +
                    distance + " сил осталось " + power);
        return true;
    }

    @Override
    public String toString() {
        return name + " сил осталось " + power;
    }
}
