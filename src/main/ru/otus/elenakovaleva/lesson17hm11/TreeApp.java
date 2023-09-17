package ru.otus.elenakovaleva.lesson17hm11;

import java.util.Arrays;
import java.util.List;

public class TreeApp {
    public static void main(String[] args) {
        Tree treeApp = new Tree();
        List<Integer> list = Arrays.asList(11, 9, 2, 78, 4, 23, 1, 45, 5, 6);
        treeApp.getSorted(list);
        Tree tree = treeApp.createTreeFromSortedList(list, 0, list.size() - 1);
        Tree emtyTree = new Tree();
        printTree(tree);
        printTree(emtyTree);
        System.out.println(treeApp.find(tree, 0));
        System.out.println(treeApp.find(tree, 6));
        System.out.println(treeApp.find(tree, 78));
        System.out.println(treeApp.find(tree, 22));

    }

    public static void printTree(Tree tree) {
        if (tree == null) {
            return;
        }
        System.out.println(tree.getVal() + " ");
        printTree(tree.getLeft());
        printTree(tree.getRight());
    }
}
