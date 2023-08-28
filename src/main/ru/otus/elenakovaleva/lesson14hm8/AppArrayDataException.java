package ru.otus.elenakovaleva.lesson14hm8;

public class AppArrayDataException extends Exception {
    public int i;
    public int j;
    AppArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String getMessage() {
        return "Преобразование не удалось. Ошибка в i = " + i + " j = " + j;
    }
}
