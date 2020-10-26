package com.step.employees;

import com.step.menu.Display;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDataManager {

    public static void readEmployee(Employee employee) {


        System.out.println(employee.id + "   " + employee.nume + " " + employee.prenume
                + "   " + employee.dataNasterii + "   " + employee.idnp + "   " + employee.salariu);
    }

    public static void readEmployeeArray(ArrayList<Employee> employee, int l) {
        System.out.println("\n\n\n");

        for(int i = 0; i < l; i++) {
            readEmployee(employee.get(i));
        }
    }

    public static void deleteEmployee(ArrayList<Employee> employee, int idToDelete) {
        if(idToDelete <= Employee.getMaxId()) {
            for(int i = 0; i < Employee.getNrEmployees(); i++)
            {
                if(employee.get(i).id == idToDelete) {
                    employee.remove(i);
                    Employee.nrEmployees--;
                    break;
                }
            }

        }
        else {
            System.out.println("Nu exista asa angajat");
        }
    }

    public static void updateEmployee(ArrayList<Employee> employee, int idToUpdate) {
        Scanner sc = new Scanner(System.in);
        if(idToUpdate <= Employee.getMaxId()) {
            for(int i = 0; i < Employee.getNrEmployees(); i++)
            {
                if(employee.get(i).id == idToUpdate) {
                    Display.updateMenu(employee.get(i));
                    int choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("\nNume curent: " + employee.get(i).getNume());
                            System.out.println("Introduceti nume nou: ");
                            sc.nextLine();
                            employee.get(i).nume = sc.nextLine();
                            break;

                        case 2:
                            System.out.println("\nNume curent: " + employee.get(i).getPrenume());
                            System.out.println("Introduceti prenume nou: ");
                            sc.nextLine();
                            employee.get(i).prenume = sc.nextLine();
                            break;

                        case 3:
                            System.out.println("\nNume curent: " + employee.get(i).getDataNasterii());
                            System.out.println("Introduceti data nastere noua: ");
                            sc.nextLine();
                            employee.get(i).dataNasterii = sc.nextLine();
                            break;

                        case 4:
                            System.out.println("\nNume curent: " + employee.get(i).getIdnp());
                            System.out.println("Introduceti idnp nou: ");
                            sc.nextLine();
                            employee.get(i).idnp = sc.nextLine();
                            break;

                        case 5:
                            System.out.println("\nNume curent: " + employee.get(i).getSalariu());
                            System.out.println("Introduceti salariu nou: ");
                            sc.nextLine();
                            employee.get(i).salariu = sc.nextInt();
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

}
