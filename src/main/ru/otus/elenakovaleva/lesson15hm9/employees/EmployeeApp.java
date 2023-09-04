package ru.otus.elenakovaleva.lesson15hm9.employees;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeApp {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Petr", 26),
                new Employee("Katya", 29),
                new Employee("Ivan", 27),
                new Employee("Olga", 30),
                new Employee("Vladimir", 32)
        ));

        System.out.println(Employee.takeName(employees));
        Employee.takeAge(employees, 28);
        System.out.println(Employee.checkAverageAge(employees, 30));
        System.out.println(Employee.youngEmployee(employees));
    }
}
