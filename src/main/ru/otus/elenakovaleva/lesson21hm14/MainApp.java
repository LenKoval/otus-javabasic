package ru.otus.elenakovaleva.lesson21hm14;

public class MainApp {
    public static void main(String[] args) throws Exception {
        MyDoubleArray myDoubleArray = new MyDoubleArray();
        //System.out.println(myDoubleArray.fillArr()); // 19580
        /*Thread t1 = new Thread(() -> myDoubleArray.fill1());
        Thread t2 = new Thread(() -> myDoubleArray.fill2());
        Thread t3 = new Thread(() -> myDoubleArray.fill3());
        Thread t4 = new Thread(() -> myDoubleArray.fill4());*/

        long startTime = System.currentTimeMillis();
        myDoubleArray.fillMain();
        long endTime = System.currentTimeMillis();
        long resTime3 = endTime - startTime;
        System.out.println(resTime3); //5
    }
}
