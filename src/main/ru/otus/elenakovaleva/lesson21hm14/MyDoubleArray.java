package ru.otus.elenakovaleva.lesson21hm14;

public class MyDoubleArray {
    private double[] arr = new double[100_000_000];

    public MyDoubleArray() {
    }

    public Long fillArr() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i/1.2);
        }
        long endTime = System.currentTimeMillis();
        long resTime = endTime - startTime;
        return resTime;
    }

    public double[] fill1() {
        for (int i = 0; i < arr.length / 4; i++) {
            arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i/1.2);
        }
        return arr;
    }

    public double[] fill2() {
        for (int i = arr.length / 4; i < arr.length / 2; i++) {
            arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i/1.2);
        }
        return arr;
    }

    public double[] fill3() {
        for (int i = arr.length/2; i < arr.length - (arr.length / 4); i++) {
            arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i/1.2);
        }
        return arr;
    }

    public double[] fill4() {
        for (int i = arr.length - (arr.length / 4); i < arr.length; i++) {
            arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i/1.2);
        }
        return arr;
    }
}
