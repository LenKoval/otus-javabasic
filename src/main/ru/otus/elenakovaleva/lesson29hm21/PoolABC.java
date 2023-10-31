package ru.otus.elenakovaleva.lesson29hm21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolABC {
    private class Printer {
        private String val;
        public void printA() {
            val = "A";
            System.out.println(Thread.currentThread().getName() + " " + val);
        }

        public void printB() {
            val = "B";
            System.out.println(Thread.currentThread().getName() + " " + val);
        }

        public void printC() {
            val = "C";
            System.out.println(Thread.currentThread().getName() + " " + val);
        }
    }
    private final Object monitor = new Object();
    private Printer printer = new Printer();

    public static void main(String[] args) {
        PoolABC poolABC = new PoolABC();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(() -> {
            poolABC.toA();
        });
        executorService.execute(() -> {
            poolABC.toB();
        });
        executorService.execute(() -> {
            poolABC.toC();
        });
        executorService.shutdown();
        /*вывод
        pool-1-thread-1 A
        pool-1-thread-2 B
        pool-1-thread-3 C
        pool-1-thread-1 A
        pool-1-thread-2 B
        pool-1-thread-3 C
        pool-1-thread-1 A
        pool-1-thread-2 B
        pool-1-thread-3 C
        pool-1-thread-1 A
        pool-1-thread-2 B
        pool-1-thread-3 C
        pool-1-thread-1 A
        pool-1-thread-2 B
        pool-1-thread-3 C*/
    }

    public void toA() {
        synchronized (monitor) {
            try {
                for (int i = 0; i <= 4; i++) {
                    while (printer.val != null) {
                        monitor.wait();
                    }
                    printer.printA();
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void toB() {
        synchronized (monitor) {
            try {
                for (int i = 0; i <= 4; i++) {
                    while (printer.val != "A") {
                        monitor.wait();
                    }
                    printer.printB();
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void toC() {
        synchronized (monitor) {
            try {
                for (int i = 0; i <= 4; i++) {
                    while (printer.val != "B") {
                        monitor.wait();
                    }
                    printer.printC();
                    printer.val = null;
                    monitor.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
