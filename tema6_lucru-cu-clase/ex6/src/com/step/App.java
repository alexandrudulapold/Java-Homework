package com.step;

import com.step.model.Employee;

public class App {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.afisare();

        Employee employee2 = new Employee("Andrei", "Cojocaru");
        employee2.afisare();

        Employee employee3 = new Employee("Andrei", "Cojocaru", "1999-02-28");
        employee3.afisare();

    }
}
