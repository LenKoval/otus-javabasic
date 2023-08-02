package lesson10.hm4box;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box("белый", true, null);

        box1.putIn("ручка");
        box1.changeColor("черный");
        box1.putIn("лампа");
        box1.printInfo();
        box1.closeBox();
        box1.printInfo();
    }



}
