package com.step.menu;

import com.step.employees.Employee;

import java.util.Scanner;

public class Display {


    private static void spaceAbove() {
        System.out.println("\n\n\n");
    }

    public static void mainMenu() {
        spaceAbove();

        System.out.println("\tMENU");
        System.out.println("------------------------------");
        System.out.println("1. Angajat nou");
        System.out.println("2. Afiseaza angajati");
        System.out.println("3. Actualizeaza angajati");
        System.out.println("4. Sterge angajati");
        System.out.println("\nOricare alt buton - iesi");
    }

    public static void updateMenu(Employee employee) {
        spaceAbove();
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Nume - " + employee.getNume());
        System.out.println("2. Prenume - " + employee.getPrenume());
        System.out.println("3. Data nasterii - " + employee.getDataNasterii());
        System.out.println("4. Idnp - " + employee.getIdnp());
        System.out.println("5. Salariu - " + employee.getSalariu());
        System.out.println("\nOricare alt buton - iesi");
    }





}
