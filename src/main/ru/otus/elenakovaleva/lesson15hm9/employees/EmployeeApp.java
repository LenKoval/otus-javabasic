package ru.otus.elenakovaleva.lesson15hm9.employees;

import java.util.ArrayList;
import java.util.List;

public class EmployeeApp {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Petr", 26),
                new Employee("Katya", 29),
                new Employee("Ivan", 27),
                new Employee("Olga", 30),
                new Employee("Vladimir", 32)
        );

        List<Employee> emp = new ArrayList<>();

        System.out.println(takeName(employees));
        takeAge(employees, 28);
        System.out.println(checkAverageAge(employees, 30));
        try {
            System.out.println(youngEmployee(emp));
        } catch (RuntimeException ex) {
            System.out.println("Список пуст.");
        }

    }

    public static List<String> takeName(List<Employee> employees) {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            names.add(employees.get(i).getName());
        }
        return names;
    }

    public static List<Employee> takeAge(List<Employee> employees, int minAge) {
        List<Employee> minAges = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getAge() >= minAge) {
                minAges.add(employees.get(i));
            }
        }
        System.out.println(minAges);
        return minAges;
    }

    public static boolean checkAverageAge(List<Employee> employees, int minAverageAge) {
        int sumAge = 0;
        for (int i = 0; i < employees.size(); i++) {
            sumAge += employees.get(i).getAge();
        }
        return sumAge/employees.size() < minAverageAge;
    }

    public static Employee youngEmployee(List<Employee> employees) {
        if (employees.isEmpty()) {
            throw new RuntimeException();
        }
        Employee employee = employees.get(0);
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getAge() < employee.getAge()) {
                employee = employees.get(i);
            }
        }
        return employee;
    }
}
