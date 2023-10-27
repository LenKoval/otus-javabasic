package ru.otus.elenakovaleva.lesson21hm14;

public class MainApp {
    public static void main(String[] args) throws Exception {
        MyDoubleArray myDoubleArray = new MyDoubleArray();
        myDoubleArray.fillArrRandom();

        System.out.println("Время выполнения цикла: " + myDoubleArray.fillArr()); // 16395
        System.out.println("Время выполнения потоков: " + myDoubleArray.fillArrWithThreads());//1
    }
}
