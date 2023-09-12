package ru.otus.elenakovaleva.lesson16hm10;

import java.util.*;

public class PhoneBookSet {
    private Map<String, Set<String>> phoneMap;

    public PhoneBookSet() {
        phoneMap = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        Set<String> phoneList = phoneMap.getOrDefault(name, new HashSet<>());
        phoneList.add(phoneNumber);
        phoneMap.put(name, phoneList);
    }

    public Set<String> find(String name) {
        return phoneMap.get(name);
    }

    public boolean containsPhoneNumber(String number) {
        for (Map.Entry<String, Set<String>> entry : phoneMap.entrySet()) {
            if (entry.getValue().contains(number)) {
                System.out.println(entry.getKey() + " " + entry.getValue());
                return true;
            }
        }
        return false;
    }
}
