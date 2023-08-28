package ru.otus.elenakovaleva.lesson14hm8;

public class AppArraySizeException extends Exception {
    @Override
    public String getMessage() {
        return "Неправильный размер массива.";
    }
}
