package com.step;

public class Calculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.adunare(1, 100));

        System.out.println(calc.adunare(5.5, 15));
    }

    public int adunare(int n1, int n2) {
        return n1 + n2;
    }

    public int scadere(int n1, int n2) {
        return n1 - n2;
    }

    public int inmultire(int n1, int n2) {
        return n1 * n2;
    }

    public int impartire(int n1, int n2) {
        return n1 / n2;
    }


    public double adunare(double n1, double n2) {
        return n1 + n2;
    }

    public double scadere(double n1, double n2) {
        return n1 - n2;
    }

    public double inmultire(double n1, double n2) {
        return n1 * n2;
    }

    public double impartire(double n1, double n2) {
        return n1 / n2;
    }


}
