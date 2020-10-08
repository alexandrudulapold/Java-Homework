package com.step;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Insert array length: ");
        int arrLength = scanner.nextInt();
        int arr[] = new int[arrLength];

        System.out.println("Insert integer numbers: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        reverseArray(arr);
    }

    public static void reverseArray(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[arr.length-1-i]);
        }
    }

}
