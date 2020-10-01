package com.step.converter;

public class TempConverter {

    public void convertToFahr(double celsius) {
        double fahr = celsius * 9 / 5 + 32;
        System.out.println(celsius + "°C → " + fahr + "°F");
    }

    public void convertToCelsius(double fahr) {
        double celsius = (fahr - 32) * 5 / 9;
        System.out.println(fahr + "°F → " + celsius + "°C");
    }
}

