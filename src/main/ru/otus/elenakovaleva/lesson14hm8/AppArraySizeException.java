package ru.otus.elenakovaleva.lesson14hm8;

public class AppArraySizeException extends RuntimeException {

    public AppArraySizeException() {
        super("Неправильный размер массива");
    }
}
