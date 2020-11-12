package com.step.employees;

import com.step.menu.DisplayMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDataManager {

    protected static int nrEmployees = 0;

    static ArrayList<Employee> employees = new ArrayList<Employee>();

    public static void addEmployee(String nume, String prenume, String dataNasterii, String idnp, int salariu) {
        employees.add(new Employee(nume, prenume, dataNasterii, idnp, salariu));

        nrEmployees++;
    }

    public static void readEmployee(Employee employee) {
        System.out.println(employee.id + "   " + employee.nume + " " + employee.prenume
                + "   " + employee.dataNasterii + "   " + employee.idnp + "   " + employee.salariu);
    }

    public static void readEmployeeArray(ArrayList<Employee> employees, int l) {
        System.out.println("\n\n\n");

        for(int i = 0; i < l; i++) {
            readEmployee(employees.get(i));
        }
    }

    public static void deleteEmployee(ArrayList<Employee> employees, int idToDelete) {
        if(idToDelete <= Employee.getMaxId()) {
            for(int i = 0; i < getNrEmployees(); i++)
            {
                if(employees.get(i).id == idToDelete) {
                    employees.remove(i);
                    nrEmployees--;
                    break;
                }
            }

        }
        else {
            System.out.println("Nu exista asa angajat");
        }
    }

    public static void updateEmployee(ArrayList<Employee> employees, int idToUpdate) {
        Scanner sc = new Scanner(System.in);
        if(idToUpdate <= Employee.getMaxId()) {
            for(int i = 0; i < getNrEmployees(); i++)
            {
                if(employees.get(i).id == idToUpdate) {
                    DisplayMenu.updateMenu(employees.get(i));
                    int choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("\nNume curent: " + employees.get(i).getNume());
                            System.out.println("Introduceti nume nou: ");
                            sc.nextLine();
                            employees.get(i).nume = sc.nextLine();
                            break;

                        case 2:
                            System.out.println("\nPrenume curent: " + employees.get(i).getPrenume());
                            System.out.println("Introduceti prenume nou: ");
                            sc.nextLine();
                            employees.get(i).prenume = sc.nextLine();
                            break;

                        case 3:
                            System.out.println("\nData nasterii curenta: " + employees.get(i).getDataNasterii());
                            System.out.println("Introduceti data nastere noua: ");
                            sc.nextLine();
                            employees.get(i).dataNasterii = sc.nextLine();
                            break;

                        case 4:
                            System.out.println("\nIDNP curent: " + employees.get(i).getIdnp());
                            System.out.println("Introduceti idnp nou: ");
                            sc.nextLine();
                            employees.get(i).idnp = sc.nextLine();
                            break;

                        case 5:
                            System.out.println("\nSalariu curent: " + employees.get(i).getSalariu());
                            System.out.println("Introduceti salariu nou: ");
                            sc.nextLine();
                            employees.get(i).salariu = sc.nextInt();
                            break;

                        default:
                            System.out.println("\nNumar incorect!");
                    }
                }
            }

        }
        else {
            System.out.println("Nu exista asa angajat");
        }
    }

    public static int getNrEmployees() {
        return nrEmployees;
    }
    public static ArrayList<Employee> getEmployees() {
        return employees;
    }
}
