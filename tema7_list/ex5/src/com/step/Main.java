package com.step;

import com.step.classes.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("abc");
        stringList.add("xyz");
        stringList.add("def");

        for(int i = 0; i < stringList.size(); i++) {
            if(stringList.get(i) == "xyz") {
                System.out.println(stringList.get(i));
            }
        }


        ///  Person

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Vasea"));
        personList.add(new Person("Igor"));
        personList.add(new Person("Ion"));

        for(int i = 0; i < personList.size(); i++) {
            if(personList.get(i).name == "Ion") {
                System.out.println(personList.get(i).name);
            }
        }
    }
}
