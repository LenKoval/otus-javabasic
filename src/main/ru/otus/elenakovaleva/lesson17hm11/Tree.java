package ru.otus.elenakovaleva.lesson17hm11;

import java.util.Collections;
import java.util.List;

public class Tree implements SearchTree {
    public Node root;
    public List<Integer> list;

    public Tree(List<Integer> list) {
        this.list = list;
    }

    public Tree(Node root) {
        this.root = root;
    }

    public Tree() {
    }

    /*public Node createTreeFromSortedList(List<Integer> sortedList, int start, int end) {
            if (start > end) {
                return null;
            }
            Node current = root;
            int mid = (start + end) / 2;
            current = sortedList.get(mid);
            root.left = createTreeFromSortedList(sortedList, start, mid - 1);
            root.right = createTreeFromSortedList(sortedList, mid + 1, end);
            return root;
        }*/
    private Node insert(List<Integer> list, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        root = new Node(list.get(mid));
        root.left = insert(list, start, mid - 1);
        root.right = insert(list, mid + 1, end);
        return root;
    }

    public Node createTreeFromSortedList(List<Integer> list) {
        if(list.isEmpty()) {
            return null;
        }
        return insert(list, 0, list.size() - 1);
    }

    @Override
    public boolean find(Integer element) {
        if (root == null) {
            return false;
        }
        if (root.val == element) {
            return true;
        }
        if(element < root.val) {
            root = root.left;
            find(element);
        } else if (element > root.val) {
            root = root.right;
            find(element);
        }
        return false;
    }

    @Override
    public List<Integer> getSorted() {
        Collections.sort(list);
        return list;
    }
}
