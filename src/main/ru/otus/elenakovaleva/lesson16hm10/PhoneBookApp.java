package ru.otus.elenakovaleva.lesson16hm10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PhoneBookApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivan Ivanovich Ivanov", "89078765544");
        phoneBook.add("Oleg Olegovich Olejko", "89997776655");
        phoneBook.add("Ivan Ivanovich Ivanov", "87775553322");
        phoneBook.add("Boris Borisovich Boriskov", "81112344455");
        phoneBook.add("Ivan Ivanovich Ivanov", "85554432211");

        PhoneBookSet phoneBookSet = new PhoneBookSet();
        phoneBookSet.add("Ivan Ivanovich Ivanov", "89078765544");
        phoneBookSet.add("Oleg Olegovich Olejko", "89997776655");
        phoneBookSet.add("Ivan Ivanovich Ivanov", "87775553322");
        phoneBookSet.add("Boris Borisovich Boriskov", "81112344455");
        phoneBookSet.add("Ivan Ivanovich Ivanov", "85554432211");

        try {
            List<String> resultFind = new ArrayList<>(phoneBook.find("Ejik"));
            System.out.println(resultFind);
        } catch (RuntimeException ex) {
            System.out.println("Абонент не существует.");
        }

        List<String> resultFindPhoneBook = phoneBook.find("Ivan Ivanovich Ivanov");
        if (resultFindPhoneBook == null) {
            System.out.println("Абонент не существует");
        } else {
            System.out.println(resultFindPhoneBook);
        }

        System.out.println(phoneBook.containsPhoneNumber("8663665577"));
        System.out.println(phoneBook.containsPhoneNumber("89078765544"));

        Set<String> resultFindPhoneBookSet = phoneBookSet.find("Ivan Ivanovich Ivanov");
        if (resultFindPhoneBookSet == null) {
            System.out.println("Абонент не существует");
        } else {
            System.out.println(resultFindPhoneBookSet);
        }

        System.out.println(phoneBookSet.containsPhoneNumber("8663665577"));

    }
}
