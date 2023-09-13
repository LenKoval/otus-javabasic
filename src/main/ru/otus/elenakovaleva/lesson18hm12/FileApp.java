package ru.otus.elenakovaleva.lesson18hm12;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileApp {
    public static void main(String[] args) {
        File files = new File("D:\\projects\\JavaBasicProject\\src\\main\\ru\\otus\\elenakovaleva\\lesson18hm12");
        displayAllFiles(files);
        System.out.println("Введите имя файла.");
        String fileName = null;
        String strForFile = null;
        try (BufferedReader buf = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = buf.readLine();
            readFile(fileName);
            System.out.println("\nВведите строку для записи в файл.");
            strForFile = buf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        addForFile(fileName, strForFile);
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
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("D:\\projects\\JavaBasicProject\\src\\main\\ru\\otus\\elenakovaleva\\lesson18hm12\\" + fileName))) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
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
