package lesson10.hm4box;

public class Box {
    private final int length = 10;
    private final int wight = 10;
    private final int height = 10;
    private String color;
    private boolean condition;
    private String contentsBox;

    public Box(String color, boolean condition, String contentsBox) {
        this.color = color;
        this.condition = condition;
        this.contentsBox = contentsBox;
    }

    public void close() {
        if(condition) {
            condition = false;
            System.out.println("Коробка закрыта.");
        }
    }

    public void open() {
        if(!condition){
            condition = true;
            System.out.println("Коробка открыта.");
        }
    }

    public void changeColor(String newColor) {
        color = newColor;
        System.out.println("Цвет коробки изменен на " + newColor);
    }

    public void putIn(String item) {
        if (contentsBox == null && !condition) {
            contentsBox = item;
            System.out.println("В коробку добавлен предмет " + contentsBox);
        } else {
            System.out.println("В коробке уже есть предмет " + contentsBox);
        }
    }

    public void takeOut() {
        if (!condition) {
            System.out.println("Коробка закрыта.");
        } else if (contentsBox == null) {
            System.out.println("Коробка пуста.");
        } else {
            System.out.println("Предмет " + contentsBox + " удален из коробки.");
            contentsBox = null;
        }
    }

    public void printInfo() {
        String conditionInfo = null;
        if (condition) {
            conditionInfo = "Коробка открыта.";
        } else {
            conditionInfo = "Коробка закрыта.";
        }
        System.out.println("Размеры коробки: " + "\nдлина: " + length + ", ширина: " + wight + ", высота: " + height +
                "\nцвет: " + color + "\nсодержимое: " + contentsBox + "\nсостояние: " + conditionInfo);
    }
}
