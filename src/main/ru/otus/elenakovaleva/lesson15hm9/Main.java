package ru.otus.elenakovaleva.lesson15hm9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 5, 3, 8, 7, 4));

        System.out.println(fillList(10, 20));
        System.out.println(sum((ArrayList<Integer>) arrayList));
        refillList(10, (ArrayList<Integer>) arrayList);
        increaseElement(2, (ArrayList<Integer>) arrayList);
    }

    public static List<Integer> fillList(int min, int max) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = min; i <= max ; i++) {
            arrayList.add(i);
        }
        return arrayList;
    }

    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 5) {
                sum += list.get(i);
            }
        }
        return sum;
    }

    public static void refillList(int number, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
        System.out.println(list);
    }

    public static void increaseElement(int number, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + number);
        }
        System.out.println(list);
    }
}
