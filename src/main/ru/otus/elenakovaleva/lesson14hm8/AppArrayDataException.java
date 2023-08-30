package ru.otus.elenakovaleva.lesson14hm8;

public class AppArrayDataException extends RuntimeException {
    AppArrayDataException(int i, int j) {
        super("Преобразование не удалось. Ошибка в i = " + i + " j = " + j);
    }
}
