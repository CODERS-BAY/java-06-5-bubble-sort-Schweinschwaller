package com.codersbay;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random fortuna = new Random();
        int arraySizeRandom = fortuna.nextInt(20) + 2; // +2 because random can also return 0
        int[] arrayRandom = new int[arraySizeRandom];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = fortuna.nextInt(100);
        }
        //TEST
        //int[] arrayRandom = {22, 0, 1, 39, 99, 51, 83, 7, 85, 55};

        System.out.println("Random Array: ");
        System.out.println(Arrays.toString(arrayRandom));

        bubbleSort(arrayRandom);

        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(arrayRandom));
    }

    public static void bubbleSort(int[] inputArray) {
        if (inputArray.length <= 1) {
            return;
        }

        for (int i = inputArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (inputArray[j + 1] < inputArray[j]) {
                    int helpElement = inputArray[j + 1];
                    inputArray[j + 1] = inputArray[j];
                    inputArray[j] = helpElement;
                }
            }
        }
        return;
    }
}