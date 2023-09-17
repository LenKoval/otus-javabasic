package ru.otus.elenakovaleva.lesson17hm11;

import java.util.List;

public interface SearchTree {
    boolean find(Tree tree, Integer element);
    List<Integer> getSorted(List<Integer> list);
}
