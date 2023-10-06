package ru.otus.elenakovaleva.lesson21hm14;

public class MyDoubleArray {
    private double[] arr = new double[100_000_000];

    public MyDoubleArray() {
    }

    public double[] fillArrRandom() {
        for (int i = 0; i < arr.length; i++) {
        arr[i] = Math.random();
        }
        return arr;
    }

    public Long fillArr() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public Long fillArrWithThreads() {
        Thread[] arrays = new Thread[4];
        for (int i = 0; i < 4; i++) {
            int inc = i;
            Thread ti = new Thread(() -> {
                int startIndex = (arr.length / 4) * inc;
                int endIndex = (arr.length / 4) * (inc + 1);
                for (int j = startIndex; j < endIndex; j++) {
                    arr[j] = 1.14 * Math.cos(j) * Math.sin(j * 0.2) * Math.cos(j / 1.2);
                }
            });
            arrays[i] = ti;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arrays.length; i++) {
            arrays[i].start();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
