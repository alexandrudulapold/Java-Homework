package com.step;

import java.util.Scanner;

public class ArrayMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Insert array length: ");
        int arrLength = scanner.nextInt();
        int arr[] = new int[arrLength];

        System.out.println("Insert integer numbers: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array max: " + arrayMax(arr));
        System.out.println("Array min: " + arrayMin(arr));
    }

    public static int arrayMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int arrayMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
