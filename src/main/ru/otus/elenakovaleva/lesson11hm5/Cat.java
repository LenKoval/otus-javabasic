package ru.otus.elenakovaleva.lesson11hm5;

public class Cat extends Animal {

    public Cat(String name, int speedRun, int speedSwim, int endurance) {
        super(name, speedRun, speedSwim, endurance);
    }

    @Override
    public int run(int distance) {
        return super.run(distance);
    }

    @Override
    public int swim(int distance) {
        System.out.println(getName() + " плавать не умеет.");
        return 0;
    }

    @Override
    public void info() {
        System.out.println("Имя: " + getName() + "\nСкорость бега: " + getSpeedRun()+
                "\nВыносливость: " + getEndurance() + "ед.");
    }
}
