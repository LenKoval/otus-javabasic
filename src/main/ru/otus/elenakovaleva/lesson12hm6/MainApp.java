package ru.otus.elenakovaleva.lesson12hm6;

public class MainApp {
    public static void main(String[] args) {
        Plate plate = new Plate(1000, 1000);
        Cat[] cats = {new Cat("Барсик", 100, false),
                      new Cat("Мурка", 100, false),
                      new Cat("Федя", 150, false),
                      new Cat("Муня", 150, false)};

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].info();
        }
        plate.infoPlate();
        plate.addFood(500);
        plate.infoPlate();
    }
}
