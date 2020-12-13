package com.step.employees;

import com.step.menu.DisplayMenu;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDataManager {

    ArrayList<Employee> employees = new ArrayList<Employee>();
    private int nrEmployees = 0;
    private int maxId = 0;

    public void addEmployee(String nume, String prenume, LocalDate dataNasterii, String idnp, int salariu) {
        employees.add(new Employee(nume, prenume, dataNasterii, idnp, salariu, this));

        maxId++;
        nrEmployees++;
    }

    public void readSerializedEmployee(Employee employee) {
        this.addEmployee(employee.nume, employee.prenume, employee.dataNasterii, employee.idnp, employee.salariu);
    }

    public void readEmployee(Employee employee) {
        System.out.println(employee.id + "   " + employee.nume + " " + employee.prenume
                + "   " + employee.dataNasterii + "   " + employee.idnp + "   " + employee.salariu);
    }

    public void readEmployeeArray(ArrayList<Employee> employees, int l) {
        System.out.println("\n\n\n");

        for(int i = 0; i < l; i++) {
            readEmployee(employees.get(i));
        }
    }

    public void deleteEmployee(ArrayList<Employee> employees, int idToDelete) {
        if(idToDelete <= maxId) {
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

    public void updateEmployee(ArrayList<Employee> employees, int idToUpdate) {
        Scanner sc = new Scanner(System.in);
        if(idToUpdate <= maxId) {
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
                            System.out.println("anul:");
                            int anUpdate = sc.nextInt();
                            System.out.println("luna:");
                            int lunaUpdate = sc.nextInt();
                            System.out.println("ziua din luna:");
                            int ziUpdate = sc.nextInt();
                            employees.get(i).dataNasterii = LocalDate.of(anUpdate,lunaUpdate,ziUpdate);
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

    public void save() {
        try {
            FileOutputStream fileOut = new FileOutputStream("D:\\programare\\java\\homework\\project\\fisiere\\employee.dat");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            DataOutputStream dataOut = new DataOutputStream(fileOut);

            dataOut.writeInt(nrEmployees);
            //dataOut.writeInt(maxId);

            for(Employee employee : this.employees) {
                objectOut.writeObject(employee);
            }

            fileOut.flush();
            fileOut.close();
            objectOut.flush();
            objectOut.close();
            dataOut.flush();
            dataOut.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException eIO) {
            System.out.println("Output exception");
        }
    }

    public int getNrEmployees() {
        return this.nrEmployees;
    }
    public int getMaxId() {
        return this.maxId;
    }

    public void setNrEmployees(int value) {
        this.nrEmployees = value;
    }
    public void setMaxId(int value) {
        this.maxId = value;
    }

    public ArrayList<Employee> getEmployees() {
        return this.employees;
    }
}
