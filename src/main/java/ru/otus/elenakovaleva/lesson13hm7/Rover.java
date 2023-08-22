package ru.otus.elenakovaleva.lesson13hm7;

public class Rover implements Moveable {
    private String name;
    private int petrol;

    public Rover(String name, int petrol) {
        this.name = name;
        this.petrol = petrol;
    }

    @Override
    public void move(int distance, Area area, Human human) {
        if (petrol >= distance) {
            petrol -= distance;
            System.out.println(human.getName() + " проехал по " + area.toString() + " на " + name + " расстояние " +
                    distance + " бензина осталось " + petrol);
        } else {
            System.out.println(name + " не хватает бензина.");
        }
    }

    @Override
    public String toString() {
        return name +" бензина осталось " + petrol;
    }
}
