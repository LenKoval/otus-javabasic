package ru.otus.elenakovaleva.lesson13hm7;

public class Bicycle implements Moveable{
    private String name;
    private static final Area[] AREAS = {Area.SWAMP};

    public Bicycle(String name) {
        this.name = name;
    }

    @Override
    public boolean move(int distance, Area area, Human human) {
        for (int i = 0; i < AREAS.length; i++) {
            if (AREAS[i] == area) {
                System.out.println(name + " не едет по заданной местности");
                return false;
            }
        }
        human.diminishPower(distance);
        System.out.println(human.getName() + " проехал по " + area.toString() + " на " + name + " расстояние" +
                distance + " сил осталось " + human.getPowerHuman());
        return true;
    }

    @Override
    public String toString() {
        return name;
    }
}
