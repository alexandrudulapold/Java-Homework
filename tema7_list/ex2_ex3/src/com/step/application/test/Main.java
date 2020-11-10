package com.step.application.test;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++) {
            arr.add(0,i);
        }

        for(Integer el: arr) {
            System.out.println(el);
        }

        //ex 3
        System.out.println(arr.indexOf(1));
        System.out.println(arr.get(4));

        
    }
}
