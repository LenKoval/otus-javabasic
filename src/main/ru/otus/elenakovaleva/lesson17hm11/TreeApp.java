package ru.otus.elenakovaleva.lesson17hm11;

import java.util.Arrays;
import java.util.List;

public class TreeApp {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11, 9, 2, 78, 4, 23, 1, 45, 5, 6);
        SearchTree searchTree = new Tree(list);
        System.out.println(searchTree);
        System.out.println(searchTree.find(6));
        System.out.println(searchTree.find(11));
        System.out.println(searchTree.find(10));
        System.out.println(searchTree);
    }
}
