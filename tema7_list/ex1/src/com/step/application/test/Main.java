package com.step.application.test;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> culori = new ArrayList<>();

        culori.add("Rosu");
        culori.add("Albastru");
        culori.add("Verde");

        for(String culoare: culori) {
            System.out.println(culoare);
        }
    }
}
