package ru.otus.elenakovaleva.lesson11hm5;

public class Animal {
    protected String name;
    protected int speedRun;
    protected int speedSwim;
    protected int endurance;
    protected int countEndurSwim;
    protected boolean tired;

    public Animal(String name, int speedRun, int speedSwim, int endurance, int countEndurSwim) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.endurance = endurance;
        this.countEndurSwim = countEndurSwim;
    }

    public int run(int distance) {
        int time;
        if(endurance >= distance) {
            endurance -= distance;
            time = distance / speedRun;
        } else {
            endurance = 0;
            tired = true;
            System.out.println("У животного " + name +" появилось состояние усталости.");
            return -1;
        }
        System.out.println(name + " пробежал " + distance + "м. за " + time + "c. и потратил " + distance + "ед. выносливости.");
        return time;
    }

    public int swim(int distance) {
        int time;
        if(endurance >= distance * countEndurSwim) {
            endurance -= (distance * countEndurSwim);
            time = distance / speedSwim;
        } else {
            endurance = 0;
            tired = true;
            System.out.println("У животного " + name +" появилось состояние усталости.");
            return -1;
        }
        System.out.println(name + " проплыл " + distance + "м. за " + time + "с. и потратил " + (distance * 2) + " ед. выносливости.");
        return time;
    }

    public void info() {
        if (endurance == 0) {
            tired = true;
        }
        System.out.println("Имя: " + name + "\nСкорость бега: " + speedRun + "м/с\nСкорость плавания: " + speedSwim +
                "м/с\nВыносливость: " + endurance + "ед.\nСостояние усталости: " + tired);
    }
}
