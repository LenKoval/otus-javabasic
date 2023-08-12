package ru.otus.elenakovaleva.lesson12hm6;

public class Cat {
    protected String name;
    protected int appetite;
    protected boolean fullness;

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    protected void eat(Plate plate) {
        if(plate.currentAmountFood > appetite) {
            fullness = plate.decreaseFood(appetite);
        }
    }

    public void info() {
        if (fullness == true) {
            System.out.println("Кот " + name + " сыт.");
        } else {
            System.out.println("Кот " + name + " голоден");
        }
    }


}
