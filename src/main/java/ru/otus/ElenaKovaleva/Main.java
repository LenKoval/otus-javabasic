package ru.otus.ElenaKovaleva;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        askUser();
        //Random random = new Random();
        //boolean b = random.nextBoolean();
        //greetings();
        //checkSign((int) (Math.random() * (40+1)) - 20, (int) (Math.random() * (40+1)) - 20, (int) (Math.random() * (40+1)) - 20);
        //selectColor();
        //compareNumbers();
        //addOrSubtractAndPrint((int) (Math.random() * 20), (int) (Math.random() * 20), b);
    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if(sum >= 0) {
            System.out.println("Сумма положительная.");
        } else {
            System.out.println("Сумма отрицательная.");
        }
    }

    public static void selectColor() {
        int data = 20;
        if (data < 10) {
            System.out.println("Красный");
        } else if (data >= 10 && data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 3;
        int b = -2;
        if(a >= b) {
            System.out.println(a + " >= " + b);
        } else {
            System.out.println(a + " < " + b);
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if(increment = true) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }

    public static void askUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5");

        int result = scanner.nextInt();
        if(result == 1) {
            greetings();
        } else if (result == 2) {
            checkSign((int) (Math.random() * (40+1)) - 20, (int) (Math.random() * (40+1)) - 20, (int) (Math.random() * (40+1)) - 20);
        } else if (result == 3) {
            selectColor();
        } else if (result == 4) {
            compareNumbers();
        } else {
            Random random = new Random();
            boolean b = random.nextBoolean();
            //boolean b = Math.random() < 0.5;
            addOrSubtractAndPrint((int) (Math.random() * 20), (int) (Math.random() * 20), b);
        }
    }
}
