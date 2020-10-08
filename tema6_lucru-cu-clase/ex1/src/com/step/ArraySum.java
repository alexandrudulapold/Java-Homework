package com.step;

import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Insert array length: ");
        int arrLength = scanner.nextInt();
        int arr[] = new int[arrLength];

        System.out.println("Insert integer numbers: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array sum: " + arraySum(arr));

    }

    public static int arraySum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
