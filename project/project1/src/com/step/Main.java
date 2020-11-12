package com.step;

import com.step.employees.Employee;
import com.step.employees.EmployeeDataManager;
import com.step.menu.DisplayMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Default employees
//        employees.add(new Employee ("Belibov", "Eugen", "1999-10-23", "7891438914514", 12000));
//        employees.add(new Employee ("Belibov", "Andrei", "2001-03-15", "4062926209264", 11000));
//        employees.add(new Employee ("Cojocaru", "Ion", "1988-02-19", "1749266020153", 26000));
        EmployeeDataManager.addEmployee("Belibov", "Eugen", "1999-10-23", "7891438914514", 12000);
        EmployeeDataManager.addEmployee("Belibov", "Andrei", "2001-03-15", "4062926209264", 11000);
        EmployeeDataManager.addEmployee("Cojocaru", "Ion", "1988-02-19", "1749266020153", 26000);


        while (true) {
            DisplayMenu.mainMenu();

            int choice = sc.next().charAt(0);


            switch (choice) {

                case '1':
                    sc.nextLine();
                    String addNume, addPrenume;
                    String addDataNasterii;
                    String addIdnp;
                    int addSalariu;

                    System.out.println("Introdu numele:");
                    addNume = sc.nextLine();
                    System.out.println("Introdu prenumele:");
                    addPrenume = sc.nextLine();
                    System.out.println("Introdu data nasterii:");
                    addDataNasterii = sc.nextLine();
                    System.out.println("Introdu IDNP:");
                    addIdnp = sc.nextLine();
                    System.out.println("Introdu salariul:");
                    addSalariu = sc.nextInt();

                    EmployeeDataManager.addEmployee(addNume, addPrenume, addDataNasterii, addIdnp, addSalariu);
                    break;

                case '2':
                    EmployeeDataManager.readEmployeeArray(EmployeeDataManager.getEmployees(), EmployeeDataManager.getNrEmployees());
                    System.out.println("\nTaseaza orice pentru a continua");
                    sc.next();
                    break;
                
                case '3':
                    EmployeeDataManager.readEmployeeArray(EmployeeDataManager.getEmployees(), EmployeeDataManager.getNrEmployees());
                    System.out.println("\nTaseaza id-ul pentru a modifica angajat");
                    int indexUpdate = sc.nextInt();
                    EmployeeDataManager.updateEmployee(EmployeeDataManager.getEmployees(), indexUpdate);
                    break;
                    
                case '4':
                    EmployeeDataManager.readEmployeeArray(EmployeeDataManager.getEmployees(), EmployeeDataManager.getNrEmployees());
                    System.out.println("\nTaseaza id-ul pentru a sterge angajat");
                    int indexDelete = sc.nextInt();
                    EmployeeDataManager.deleteEmployee(EmployeeDataManager.getEmployees(), indexDelete);
                    break;


                default:
                    System.exit(0);
                    break;


            }

        }


    }
}
