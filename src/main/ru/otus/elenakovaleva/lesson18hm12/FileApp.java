package ru.otus.elenakovaleva.lesson18hm12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Properties;
import java.util.Scanner;

public class FileApp {
    public static void main(String[] args) {
        String[] wordsPath = {"src", "main", "ru", "otus", "elenakovaleva", "lesson18hm12"};
        String filePath = String.join(File.separator, wordsPath);
        Path path = Path.of(filePath);
        displayAllFiles(path.toFile());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла.");
        String fileName = scanner.nextLine();
        File file = new File(fileName);
        if (file.exists() && file.canRead()) {
            readFile(fileName);
            System.out.println("\nВведите строку для записи в файл.");
            String strForFile = scanner.nextLine();
            addForFile(fileName, strForFile);
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

    public static void readFile(String fileName) {
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(fileName))) {
            byte[] buf = new byte[256];
            int n;
            while ((n = in.read(buf)) > 0) {
                if (n < 256) {
                    buf = Arrays.copyOf(buf, n);
                }
            }
            String strFile = new String(buf, StandardCharsets.UTF_8);
            System.out.print(strFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addForFile(String fileName, String string) {
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fileName, true))) {
            byte[] buffer = string.getBytes(StandardCharsets.UTF_8);
            out.write(buffer);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
