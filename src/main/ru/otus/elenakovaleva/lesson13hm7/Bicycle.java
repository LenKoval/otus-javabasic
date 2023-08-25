package ru.otus.elenakovaleva.lesson13hm7;

public class Bicycle implements Moveable{
    private String name;
    private static final Area[] areas = {Area.SWAMP};

    public Bicycle(String name) {
        this.name = name;
    }

    @Override
    public void move(int distance, Area area, Human human) {
        for (int i = 0; i < areas.length; i++) {
            if (areas[i] == area) {
                System.out.println(name + " не едет по заданной местности");
                return;
            }
        }
        human.diminishPower(distance);
        System.out.println(human.getName() + " проехал по " + area.toString() + " на " + name + " расстояние" +
                distance + " сил осталось " + human.getPowerHuman());
    }

    @Override
    public String toString() {
        return name;
    }
}
