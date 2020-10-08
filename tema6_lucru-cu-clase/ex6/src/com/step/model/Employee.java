package com.step.model;

public class Employee {
    String name;
    String surname;
    String birthdate;


    public Employee() {
        name = "Vasiok";
        surname = "Ivanici";
        birthdate = "2000/06/25";
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, String birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }


    public void afisare() {
        System.out.println("Name: " + this.name);
        System.out.println("Surame: " + this.surname);
        System.out.println("Birthdate: " + this.birthdate);
    }
}
