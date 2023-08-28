package ru.otus.elenakovaleva.lesson13hm7;

public class Car implements Moveable {
    private String name;
    private int petrol;
    private static final Area[] AREAS = {Area.FOREST, Area.SWAMP};

    public Car(String name, int petrol) {
        this.name = name;
        this.petrol = petrol;
    }

    @Override
    public boolean move(int distance, Area area, Human human) {
        for (int i = 0; i < AREAS.length; i++) {
            if (AREAS[i] == area) {
                System.out.println(name + " не едет по заданной местности.");
                return false;
            }
        }
        if (petrol < distance) {
            System.out.println(name + " не хватает бензина: " + petrol);
            return false;
        }
        petrol -= distance;
        System.out.println(human.getName() + " проехал по " + area.toString() + " на " + name + " расстояние " +
                        distance + " бензина осталось " + petrol);
        return true;
    }

    @Override
    public String toString() {
        return name + " бензина осталось " + petrol;
    }
}
