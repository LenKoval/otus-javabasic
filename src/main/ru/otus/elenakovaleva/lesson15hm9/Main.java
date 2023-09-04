package ru.otus.elenakovaleva.lesson15hm9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 5, 3, 8, 7, 4));

        System.out.println(fillList(10, 20));
        System.out.println(sum(arrayList));
        refillList(10, arrayList);
        increaseElement(2, arrayList);
    }

    public static List<Integer> fillList(int min, int max) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = min; i <= max ; i++) {
            arrayList.add(i);
        }
        return arrayList;
    }

    public static int sum(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > 5) {
                sum += arrayList.get(i);
            }
        }
        return sum;
    }

    public static void refillList(int number, ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, number);
        }
        System.out.println(arrayList);
    }

    public static void increaseElement(int number, ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, arrayList.get(i) + number);
        }
        System.out.println(arrayList);
    }
}
