package ru.otus.elenakovaleva.lesson11hm5;

public class Dog extends Animal {

    public Dog(String name, int speedRun, int speedSwim, int endurance) {
        super(name, speedRun, speedSwim, endurance);
    }

    @Override
    public int run(int distance) {
        return super.run(distance);
    }

    @Override
    public int swim(int distance) {
        return super.swim(distance);
    }

    @Override
    public void info() {
        super.info();
    }
}
