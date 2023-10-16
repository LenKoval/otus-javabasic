package ru.otus.elenakovaleva.lesson26hm19;


import static ru.otus.elenakovaleva.lesson26hm19.Box.pour;

public class FruitBoxApp {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Fruit> fruitBox = new Box<>();

        for (int i = 0; i < 30; i++) {
            Apple apple = new Apple();
            appleBox.addFruit(apple);
        }

        for (int i = 0; i < 10; i++) {
            Apple apple = new Apple();
            appleBox1.addFruit(apple);
        }

        for (int i = 0; i < 60; i++) {
            Orange orange = new Orange();
            orangeBox.addFruit(orange);
        }

        for (int i = 0; i < 20; i++) {
            Apple apple = new Apple();
            Orange orange = new Orange();
            fruitBox.addFruit(apple);
            fruitBox.addFruit(orange);
        }

        //проверяем вес заполненных коробок
        System.out.println(appleBox.weight());
        System.out.println(orangeBox.weight());
        System.out.println(fruitBox.weight());

        //случаи для проверки
        Box<Apple> appleBox2 = null;
        Apple apple = new Apple();
        Orange orange = null;

        fruitBox.addFruit(apple);
        appleBox.addFruit(apple);
        orangeBox.addFruit(orange); // не пройдет проверку
        System.out.println(appleBox.compare(orangeBox));
        pour(fruitBox, appleBox1);
        pour(appleBox1, appleBox);
        pour(appleBox2, appleBox); // не пройдет проверку
        pour(appleBox, appleBox); // не пройдет проверку
        //pour(appleBox1, orangeBox); // не сработает
        //pour(orangeBox, fruitBox); // не сработает
    }
}
