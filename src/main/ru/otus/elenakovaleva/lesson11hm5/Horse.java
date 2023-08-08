package ru.otus.elenakovaleva.lesson11hm5;

public class Horse extends Animal {

    public Horse(String name, int speedRun, int speedSwim, int endurance) {
        super(name, speedRun, speedSwim, endurance);
    }

    @Override
    public int run(int distance) {
        return super.run(distance);
    }

    @Override
    public int swim(int distance) {
        int time;
        if(endurance > distance * 4 || endurance == distance * 4) {
            endurance -= (distance * 4);
            time = distance / speedSwim;
        } else {
            endurance = 0;
            System.out.println("У животного " + name +" появилось состояние усталости.");
            return -1;
        }
        System.out.println(name + " проплыл " + distance + "м. за " + time + "с. и потратил " + (distance * 4) + " ед. выносливости.");
        return time;
    }

    @Override
    public void info() {
        super.info();
    }
}
