package com.step;

import java.util.Scanner;

public class FindInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        char arr[] = new char[10];

        System.out.println("Insert chars: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLine().charAt(0);
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println("Litera '" + arr[i] + "' este o " + charCheck(arr[i]));
        }

    }

    public static String charCheck(char c) {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "vocala";
        }
        else {
            return "consoana";
        }
    }
}

