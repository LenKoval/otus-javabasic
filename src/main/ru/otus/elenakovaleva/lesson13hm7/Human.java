package ru.otus.elenakovaleva.lesson13hm7;

public class Human implements Driver {
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

    protected void transfer(int distance, Area area) {
        if (currentTransport == null) {
            walk(distance, area);
            return;
        }
        currentTransport.move(distance, area, this);
    }
    protected void walk(int distance, Area area) {
        if (powerHuman >= distance) {
            diminishPower(distance);
            System.out.println(name + " прошел " + distance + " по " + area.toString() + " сил осталось " + powerHuman);
        } else {
            System.out.println("У " + name + " не хватает сил.");
        }
    }

    protected void diminishPower(int distance) {
        powerHuman -= distance;
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
