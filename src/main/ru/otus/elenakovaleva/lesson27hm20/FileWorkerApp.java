package ru.otus.elenakovaleva.lesson27hm20;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class FileWorkerApp {
    public static void main(String[] args) throws IOException {
        String[] wordsPath = {"src", "main", "ru", "otus", "elenakovaleva", "lesson27hm20"};
        String filePath = String.join(File.separator, wordsPath);
        Path path = Path.of(filePath);
        displayAllFiles(path.toFile());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла.");
        String fileName = scanner.nextLine();
        File file = new File(fileName);
        if (file.exists() && file.canRead()) {
            System.out.println("\nВведите искомую последовательность символов.");
            String strSymbols = scanner.nextLine();
            countSymbols(fileName, strSymbols);
        } else {
            System.out.println("Файл не доступен.");
        }
        scanner.close();
    }

    public static void displayAllFiles(File dir) {
        try {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static int countSymbols(String fileName, String string) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        int count = 0;
        while (bufferedReader.ready()) {
                if (bufferedReader.readLine().contains(string)) {
                    count++;
                }
            }
        return count;
    }
}
