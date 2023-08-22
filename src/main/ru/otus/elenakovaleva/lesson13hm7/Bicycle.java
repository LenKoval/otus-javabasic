package ru.otus.elenakovaleva.lesson13hm7;

public class Bicycle implements Moveable{
    private String name;

    public Bicycle(String name) {
        this.name = name;
    }

    @Override
    public void move(int distance, Area area, Human human) {
        if (Area.SWAMP.equals(area)) {
            System.out.println("Велосипед не едет по заданной местности");
        }
        human.setPowerHuman(human.getPowerHuman() - distance);
        System.out.println(human.getName() + " проехал по " + area.toString() + " на " + name + " расстояние" +
                distance + " сил осталось " + human.getPowerHuman());
    }

    @Override
    public String toString() {
        return name;
    }
}
