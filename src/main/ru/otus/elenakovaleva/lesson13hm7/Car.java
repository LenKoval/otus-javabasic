package ru.otus.elenakovaleva.lesson13hm7;

public class Car implements Moveable {
    private String name;
    private int petrol;
    private final Area[] areas = {Area.FOREST, Area.SWAMP};

    public Car(String name, int petrol) {
        this.name = name;
        this.petrol = petrol;
    }

    @Override
    public void move(int distance, Area area, Human human) {
        for (int i = 0; i < areas.length; i++) {
            if (areas[i] == area) {
                System.out.println(name + " не едет по заданной местности.");
                return;
            }
        }
        if (petrol >= distance) {
            petrol -= distance;
            System.out.println(human.getName() + " проехал по " + area.toString() + " на " + name + " расстояние " +
                        distance + " бензина осталось " + petrol);
        } else {
            System.out.println(name + " не хватает бензина: " + petrol);
        }
    }

    @Override
    public String toString() {
        return name + " бензина осталось " + petrol;
    }
}
