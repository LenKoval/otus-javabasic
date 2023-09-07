package ru.otus.elenakovaleva.lesson15hm9.employees;


public class Employee implements Comparable<Employee> {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    @Override
    public int compareTo(Employee o) {
        if (this.age != o.getAge()) {
            return this.age - o.getAge();
        }
        return this.name.compareTo(o.getName());
    }
}
