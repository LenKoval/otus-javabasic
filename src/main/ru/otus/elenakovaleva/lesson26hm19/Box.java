package ru.otus.elenakovaleva.lesson26hm19;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;

    public <T>Box() {
        this.fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public int weight() {
        int mainWeight = 0;
        for (T fruit : fruits) {
            mainWeight += fruit.weight;
        }
        return mainWeight;
    }

    public boolean compare(Box<?> box) {
        return Math.abs(this.weight() - box.weight()) == 0;
    }

    public static <T extends Fruit> void pour(Box<? super T> boxOne, Box<? extends T> boxTwo) {
        for (T fruit : boxTwo.fruits) {
            boxOne.addFruit(fruit);
        }
        boxTwo.fruits.clear();
    }
}
