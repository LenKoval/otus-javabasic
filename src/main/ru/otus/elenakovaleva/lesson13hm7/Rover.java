package ru.otus.elenakovaleva.lesson13hm7;

public class Rover implements Moveable{
    private String name;
    private int petrol;

    public Rover(String name, int petrol) {
        this.name = name;
        this.petrol = petrol;
    }

    @Override
    public boolean move(int distance, Area area, Human human) {
        if (petrol < distance) {
            System.out.println(name + " не хватает бензина.");
            return false;
        }
        petrol -= distance;
        System.out.println(human.getName() + " проехал по " + area.toString() + " на " + name + " расстояние" +
                    distance + " бензина осталось " + petrol);
        return true;
    }

    @Override
    public String toString() {
        return name + " бензина осталось " + petrol;
    }
}
