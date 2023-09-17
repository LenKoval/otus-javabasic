package ru.otus.elenakovaleva.lesson17hm11;

import java.util.Collections;
import java.util.List;

public class Tree implements SearchTree {
    private int val;
    private Tree left;
    private Tree right;

    public Tree(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public Tree() {

    }

    public int getVal() {
        return val;
    }

    public Tree getLeft() {
        return left;
    }

    public Tree getRight() {
        return right;
    }

    public static Tree createTreeFromSortedList(List<Integer> list, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Tree node = new Tree(list.get(mid));
        node.left = createTreeFromSortedList(list, start, mid - 1);
        node.right = createTreeFromSortedList(list, mid + 1, end);
        return node;
    }

    @Override
    public boolean find(Tree tree, Integer element) {
        if (tree == null) {
            return false;
        }
        if (tree.val == element) {
            return true;
        }
        if(element < tree.val) {
            return find(tree.left, element);
        } else if (element > tree.val) {
            return find(tree.right, element);
        }
        return false;
    }

    @Override
    public List<Integer> getSorted(List<Integer> list) {
        Collections.sort(list);
        return list;
    }
}
