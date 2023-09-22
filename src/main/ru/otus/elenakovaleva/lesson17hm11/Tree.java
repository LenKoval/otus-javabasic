package ru.otus.elenakovaleva.lesson17hm11;

import java.util.Collections;
import java.util.List;

public class Tree implements SearchTree {
    public Node root;
    public List<Integer> list;

    public Tree(List<Integer> list) {
        Collections.sort(list);
        root = createTreeFromSortedList(list);
    }
    private Node insert(List<Integer> list, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node node = new Node(list.get(mid));
        node.left = insert(list, start, mid - 1);
        node.right = insert(list, mid + 1, end);
        return node;
    }

    public Node createTreeFromSortedList(List<Integer> list) {
        if(list.isEmpty()) {
            return null;
        }
        return insert(list, 0, list.size() - 1);
    }

    @Override
    public Integer find(Integer element) {
        return get(root, element);
    }

    private Integer get(Node x, Integer value) {
        if (x == null) {
            return null;
        }
        int cmp = value.compareTo(x.val);
        if (cmp < 0) {
            return get(x.left, value);
        } else if (cmp > 0) {
            return get(x.right, value);
        } else {
            return x.val;
        }
    }

    @Override
    public List<Integer> getSorted() {
        Collections.sort(list);
        return list;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}
