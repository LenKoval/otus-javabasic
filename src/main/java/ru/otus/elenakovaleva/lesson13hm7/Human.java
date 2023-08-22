package ru.otus.elenakovaleva.lesson13hm7;

public class Human implements Useable {
    private String name;
    private Moveable currentTransport;
    private int powerHuman;

    public Human(String name, Moveable currentTransport, int powerHuman) {
        this.name = name;
        this.currentTransport = currentTransport;
        this.powerHuman = powerHuman;
    }

    public String getName() {
        return name;
    }

    public int getPowerHuman() {
        return powerHuman;
    }

    public void setPowerHuman(int powerHuman) {
        if (powerHuman >= 0) {
            this.powerHuman = powerHuman;
        }
    }
    public void transfer(int distance, Area area, Moveable moveable, Human human) {
        if (currentTransport == null) {
            walk(distance, area);
            return;
        }
        if (moveable != currentTransport) {
            System.out.println(name + " использует другой транспорт.");
            return;
        }
        moveable.move(distance, area, human);
    }

    protected void walk(int distance, Area area) {
        if (powerHuman >= distance) {
            powerHuman -= distance;
            System.out.println(name + " прошел " + distance + " сил осталось " + powerHuman);
            return;
        }
        System.out.println("У " + name + " не хватает сил.");
    }
    @Override
    public void goIn(Moveable moveable) {
        if (currentTransport != null) {
            System.out.println(name + " сидит в другом транспорте.");
        }
            currentTransport = moveable;
            System.out.println(name + " сел на " + moveable.toString());
    }

    @Override
    public void goOut(Moveable moveable) {
        if (currentTransport != null) {
            currentTransport = null;
            System.out.println(name + " вышел с " + moveable.toString());
        }
    }
}
