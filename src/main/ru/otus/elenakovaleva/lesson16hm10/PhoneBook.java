package ru.otus.elenakovaleva.lesson16hm10;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phoneMap;

    public PhoneBook() {
        phoneMap = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        List<String> phoneList = phoneMap.getOrDefault(name, new ArrayList<>());
        phoneList.add(phoneNumber);
        phoneMap.put(name, phoneList);
    }

    public List<String> find(String name) {
        return phoneMap.get(name);
    }

    public boolean containsPhoneNumber(String number) {
        for (Map.Entry<String, List<String>> entry : phoneMap.entrySet()) {
            if (entry.getValue().contains(number)) {
                return true;
            }
        }
        return false;
    }

    /*public boolean containsPhoneNumber(String number) {
        List<String> entries = convertToList(phoneMap);
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).contains(number)) {
                return true;
            }
        }
        return false;
    }*/

    /*public static List<String> convertToList(Map<String, List<String>> map) {
        List<String> values = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            values.add(entry.getValue().toString());
        }
        return values;
    }*/
}
