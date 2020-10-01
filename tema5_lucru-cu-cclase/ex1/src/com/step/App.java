package com.step;

import com.step.calculator.Calculator;
import com.step.comparator.NumbersComparator;
import com.step.converter.TempConverter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        TempConverter t = new TempConverter();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti temperatura in Fahrenheiti: ");
        double scanFahr = sc.nextDouble();
        t.convertToCelsius(scanFahr);

        System.out.println("Introduceti temperatura in Celsius: ");
        double scanCelsius = sc.nextDouble();
        t.convertToFahr(scanCelsius);



        System.out.println("\n\nIntroduceti doua numere:");
        System.out.println("nr. 1: ");
        double nr1 = sc.nextDouble();

        System.out.println("nr. 2: ");
        double nr2 = sc.nextDouble();

        Calculator calc = new Calculator();

        System.out.println(nr1 + " + " + nr2 + " = " + calc.adunare(nr1,nr2));
        System.out.println(nr1 + " - " + nr2 + " = " + calc.scadere(nr1,nr2));
        System.out.println(nr1 + " * " + nr2 + " = " + calc.inmultire(nr1,nr2));
        System.out.println(nr1 + " / " + nr2 + " = " + calc.impartire(nr1,nr2));


        NumbersComparator numcomp = new NumbersComparator();

        System.out.println("\n" + numcomp.nrMax(nr1,nr2) + " > " + numcomp.nrMin(nr1,nr2));

    }
}
