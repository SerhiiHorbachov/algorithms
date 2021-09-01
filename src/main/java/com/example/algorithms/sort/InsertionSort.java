package com.example.algorithms.sort;

public class InsertionSort {

    public static void sort(int[] arr) {
        for (int i = 1, n = arr.length; i < n; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
}




