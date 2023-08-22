package ru.otus.elenakovaleva.lesson13hm7;

public enum Area {
    FOREST ("густой лес"),
    PLAIN ("равнина"),
    SWAMP ("болото");

    private String title;

    Area(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
