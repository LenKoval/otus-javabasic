package ru.otus.elenakovaleva.lesson15hm9.employees;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    public static List<String> takeName(ArrayList<Employee> employees) {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            names.add(employees.get(i).name);
        }
        return names;
    }

    public static List<Employee> takeAge(ArrayList<Employee> employees, int minAge) {
        ArrayList<Employee> minAges = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).age >= minAge) {
                minAges.add(employees.get(i));
            }
        }
        System.out.println(minAges);
        return minAges;
    }

    public static boolean checkAverageAge(ArrayList<Employee> employees, int minAverageAge) {
        int sumAge = 0;
        for (int i = 0; i < employees.size(); i++) {
            sumAge += employees.get(i).age;
        }
        if (sumAge/employees.size() < minAverageAge) {
            return false;
        }
        return true;
    }

    public static Employee youngEmployee(ArrayList<Employee> employees) {
        Employee employee = employees.get(0);
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).age < employee.age) {
                employee = employees.get(i);
            }
        }
        return employee;
    }
}
