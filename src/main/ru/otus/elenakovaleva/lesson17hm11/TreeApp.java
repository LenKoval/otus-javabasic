package ru.otus.elenakovaleva.lesson17hm11;

import java.util.Arrays;
import java.util.List;

public class TreeApp {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11, 9, 2, 78, 4, 23, 1, 45, 5, 6);
        Tree treeList = new Tree(list);
        Tree treeNodes = new Tree();
        treeNodes.createTreeFromSortedList(treeList.getSorted());
        System.out.println(treeNodes.find(6));

    }

    /*public static void printTree(Node node) {
        if (node == null) {
            return;
        }
        printTree(node.left);
        System.out.printf("%s", node.val);
        printTree(node.right);
    }*/
}
