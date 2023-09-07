package ru.otus.elenakovaleva.lesson16hm10;

public class PhoneBookApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivan Ivanovich Ivanov", "89078765544");
        phoneBook.add("Oleg Olegovich Olejko", "89997776655");
        phoneBook.add("Ivan Ivanovich Ivanov", "87775553322");
        phoneBook.add("Boris Borisovich Boriskov", "81112344455");
        phoneBook.add("Ivan Ivanovich Ivanov", "85554432211");

        phoneBook.find("Ejik");
        System.out.println(phoneBook.find("Ivan Ivanovich Ivanov"));
        System.out.println(phoneBook.containsPhoneNumber("8663665577"));
        System.out.println(phoneBook.containsPhoneNumber("89078765544"));
    }
}
