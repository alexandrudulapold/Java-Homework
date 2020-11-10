package com.step.application.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("l1-1");
        list1.add("l1-2");
        list1.add("l1-3");

        list2.add("l2-1");
        list2.add("l2-2");
        list2.add("l2-3");

        list1.addAll(list2);

        for (String el: list1) {
            System.out.println(el);
        }
    }
}
