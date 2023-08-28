package ru.otus.elenakovaleva.lesson14hm8;

public class Main {
    public static void main(String[] args) {
        String[][] strings1 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String[][] strings2 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}};
        String[][] strings3 = {{"1", "2", "Три", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String[][] strings4 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "null"}};
        String[][] strings5 = {{"1", "2", "-3", "4"}, {"-5", "6", "7", "8"}, {"9", "10", "11", "-12"}, {"13", "14", "-15", "16"}};

        try {
            int result = sum(strings1);
            System.out.println(result);
        } catch (AppArraySizeException ex) {
            System.out.println(ex.getMessage());
        } catch (AppArrayDataException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            int result = sum(strings2);
            System.out.println(result);
        } catch (AppArraySizeException ex) {
            System.out.println(ex.getMessage());
        } catch (AppArrayDataException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            int result = sum(strings3);
            System.out.println(result);
        } catch (AppArraySizeException ex) {
            System.out.println(ex.getMessage());
        } catch (AppArrayDataException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            int result = sum(strings4);
            System.out.println(result);
        } catch (AppArraySizeException ex) {
            System.out.println(ex.getMessage());
        } catch (AppArrayDataException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            int result = sum(strings5);
            System.out.println(result);
        } catch (AppArraySizeException ex) {
            System.out.println(ex.getMessage());
        } catch (AppArrayDataException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int sum(String[][] strings) throws AppArraySizeException,AppArrayDataException {
        int sum = 0;
        if (strings.length != 4) {
            throw new AppArraySizeException();
        }
        for (int i = 0; i < strings.length; i ++) {
            for (int j = 0; j < strings.length; j++) {
                try {
                    sum += Integer.parseInt(strings[i][j]);
                } catch (NumberFormatException ex) {
                    throw new AppArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
