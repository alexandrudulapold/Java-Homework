package com.step;

import com.step.employees.Employee;
import com.step.employees.EmployeeDataManager;
import com.step.menu.Display;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> employee = new ArrayList<Employee>();

        // Default employees
        employee.add(new Employee ("Belibov", "Eugen", "1999-10-23", "7891438914514", 12000));
        employee.add(new Employee ("Belibov", "Andrei", "2001-03-15", "4062926209264", 11000));
        employee.add(new Employee ("Cojocaru", "Ion", "1988-02-19", "1749266020153", 26000));


        while (true) {
            Display.mainMenu();

            int choice = sc.next().charAt(0);


            switch (choice) {

                case '1':
                    employee.add(new Employee());
                    break;

                case '2':
                    EmployeeDataManager.readEmployeeArray(employee, Employee.getNrEmployees());
                    System.out.println("\nTaseaza orice pentru a continua");
                    sc.next();
                    break;
                
                case '3':
                    EmployeeDataManager.readEmployeeArray(employee, Employee.getNrEmployees());
                    System.out.println("\nTaseaza id-ul pentru a modifica angajat");
                    int indexUpdate = sc.nextInt();
                    EmployeeDataManager.updateEmployee(employee, indexUpdate);
                    break;
                    
                case '4':
                    EmployeeDataManager.readEmployeeArray(employee, Employee.getNrEmployees());
                    System.out.println("\nTaseaza id-ul pentru a sterge angajat");
                    int indexDelete = sc.nextInt();
                    EmployeeDataManager.deleteEmployee(employee, indexDelete);
                    break;


                default:
                    System.exit(0);
                    break;


            }

        }


    }
}
