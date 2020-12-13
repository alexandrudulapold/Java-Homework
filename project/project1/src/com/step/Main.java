package com.step;

import com.step.employees.Employee;
import com.step.employees.EmployeeDataManager;
import com.step.menu.DisplayMenu;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main implements Serializable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDataManager empDataManager = new EmployeeDataManager();

        // Default employees
        /*empDataManager.addEmployee("Belibov", "Eugen", LocalDate.parse("1999-10-23"), "7891438914514", 12000);
        empDataManager.addEmployee("Belibov", "Andrei", LocalDate.parse("2001-03-15"), "4062926209264", 11000);
        empDataManager.addEmployee("Cojocaru", "Ion", LocalDate.parse("1988-02-19"), "1749266020153", 26000);*/

        try {
            FileInputStream fileIn = new FileInputStream("D:\\programare\\java\\homework\\project\\fisiere\\employee.dat");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            DataInputStream dataIn = new DataInputStream(fileIn);

            int nrEmp = dataIn.readInt();

            for(int i = 0; i < nrEmp; i++) {
                Object obj = objIn.readObject();
                if(obj == null) {
                    break;
                }
                empDataManager.readSerializedEmployee((Employee)obj);
            }

            fileIn.close();
            objIn.close();
            dataIn.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("No employee.dat found. Skipping importing the data");
        } catch (ClassNotFoundException eC) {
            System.out.println("Class not found");
        } catch (IOException eIO) {
            System.out.println("Input exception");
        }


        while (true) {
            DisplayMenu.mainMenu();

            int choice = sc.next().charAt(0);


            switch (choice) {

                case '1':
                    sc.nextLine();
                    String addNume, addPrenume;
                    LocalDate addDataNasterii;
                    String addIdnp;
                    int addSalariu;

                    System.out.println("Introdu numele:");
                    addNume = sc.nextLine();
                    System.out.println("Introdu prenumele:");
                    addPrenume = sc.nextLine();

                    System.out.println("Introdu data nasterii:");
                    System.out.println("anul:");
                    int an = sc.nextInt();
                    System.out.println("luna:");
                    int luna = sc.nextInt();
                    System.out.println("ziua din luna:");
                    int zi = sc.nextInt();
                    addDataNasterii = LocalDate.of(an,luna,zi);
                    sc.nextLine();

                    System.out.println("Introdu IDNP:");
                    addIdnp = sc.nextLine();
                    System.out.println("Introdu salariul:");
                    addSalariu = sc.nextInt();

                    empDataManager.addEmployee(addNume, addPrenume, addDataNasterii, addIdnp, addSalariu);
                    break;

                case '2':
                    empDataManager.readEmployeeArray(empDataManager.getEmployees(), empDataManager.getNrEmployees());
                    System.out.println("\nTaseaza orice pentru a continua");
                    sc.next();
                    break;
                
                case '3':
                    empDataManager.readEmployeeArray(empDataManager.getEmployees(), empDataManager.getNrEmployees());
                    System.out.println("\nTaseaza id-ul pentru a modifica angajat");
                    int indexUpdate = sc.nextInt();
                    empDataManager.updateEmployee(empDataManager.getEmployees(), indexUpdate);
                    break;
                    
                case '4':
                    empDataManager.readEmployeeArray(empDataManager.getEmployees(), empDataManager.getNrEmployees());
                    System.out.println("\nTaseaza id-ul pentru a sterge angajat");
                    int indexDelete = sc.nextInt();
                    empDataManager.deleteEmployee(empDataManager.getEmployees(), indexDelete);
                    break;


                default:

                    empDataManager.save();
                    System.exit(0);
                    break;


            }

        }


    }
}
