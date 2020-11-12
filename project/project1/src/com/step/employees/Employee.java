package com.step.employees;

import java.time.LocalDate;
import java.util.Scanner;

public class Employee {

    private static int maxId = 0;

    protected int id;
    protected String nume;
    protected String prenume;
    protected String dataNasterii;
    protected String idnp;
    protected int salariu;


    // CONSTRUCTORI
    /*public Employee() {
        System.out.println("ANGAJAT NOU\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdu numele:");
        this.nume = sc.nextLine();
        System.out.println("Introdu prenumele:");
        this.prenume = sc.nextLine();
        System.out.println("Introdu data nasterii:");
        this.dataNasterii = sc.nextLine();
        System.out.println("Introdu IDNP:");
        this.idnp = sc.nextLine();
        System.out.println("Introdu salariul:");
        this.salariu = sc.nextInt();

        this.id = ++maxId;
        nrEmployees++;
    }*/

    protected Employee(String nume, String prenume, String dataNasterii, String idnp, int salariu) {
        this.nume = nume;
        this.prenume = prenume;
        this.dataNasterii = dataNasterii;
        this.idnp = idnp;
        this.salariu = salariu;

        this.id = ++maxId;

    }
    // SFARSIT CONSTRUCTORI



    public static int getMaxId() {
        return maxId;
    }

    public String getNume() {return nume;}
    public String getPrenume() {return prenume;}
    public String getDataNasterii() {return dataNasterii;}
    public String getIdnp() {return idnp;}
    public int getSalariu() {return salariu;}


}
