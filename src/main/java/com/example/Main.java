package com.example;

import com.example.algorithms.sort.MergeSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 5, 2, 4, 6, 1, 3, 8, 7};

        System.out.print("Unsorted: ");
        Arrays.stream(arr).forEach(System.out::print);
        System.out.print("\n");

        MergeSort.sort(arr);

        System.out.print("Sorted: ");
        Arrays.stream(arr).forEach(System.out::print);
    }
}
