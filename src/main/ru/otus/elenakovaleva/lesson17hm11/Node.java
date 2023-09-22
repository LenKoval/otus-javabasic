package ru.otus.elenakovaleva.lesson17hm11;

public class Node {
    Integer val;
    Node left;
    Node right;

    public Node(Integer val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
