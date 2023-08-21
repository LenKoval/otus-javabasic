package ru.otus.elenakovaleva.lesson12hm6;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    protected void eat(Plate plate) {
        if(plate.getCurrentAmountFood() > appetite) {
            fullness = plate.decreaseFood(appetite);
        }
    }

    public void info() {
        if (fullness) {
            System.out.println("Кот " + name + " сыт.");
        } else {
            System.out.println("Кот " + name + " голоден");
        }
    }


}
