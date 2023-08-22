package ru.otus.elenakovaleva.lesson13hm7;

public class Car implements Moveable {
    private String name;
    private int petrol;

    public Car(String name, int petrol) {
        this.name = name;
        this.petrol = petrol;
    }

    @Override
    public void move(int distance, Area area, Human human) {
        if (Area.PLAIN.equals(area) && petrol >= distance) {
            petrol -= distance;
            System.out.println(human.getName() + " проехал по " + area.toString() + " на " + name + " расстояние " +
                    distance + " бензина осталось " + petrol);
        } else {
            System.out.println(name + " не может проехать по заданной местности или бензина не хватает, бензина " + petrol);
        }
    }

    @Override
    public String toString() {
        return name + " бензина осталось " + petrol;
    }
}
