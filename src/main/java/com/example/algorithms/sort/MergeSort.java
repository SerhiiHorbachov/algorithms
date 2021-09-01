package com.example.algorithms.sort;

public class MergeSort {

    public static void sort(int[] array) {

        if (array.length < 2) {
            return;
        }
        int mid = array.length / 2;

        int[] left = new int[mid];
        System.arraycopy(array, 0, left, 0, left.length);

        int[] right = new int[array.length - mid];
        System.arraycopy(array, mid, right, 0, right.length);

        sort(left);
        sort(right);

        merge(array, left, right);
    }

    private static void merge(int[] resultArray, int[] left, int[] right) {

        int indexLeft = 0;
        int indexRight = 0;
        int indexRes = 0;

        while (indexRes < resultArray.length) {

            if (indexLeft < left.length && indexRight < right.length) {
                if (left[indexLeft] < right[indexRight]) {
                    resultArray[indexRes] = left[indexLeft++];
                } else {
                    resultArray[indexRes] = right[indexRight++];
                }
            } else if (indexLeft < left.length) {
                resultArray[indexRes] = left[indexLeft++];
            } else if (indexRight < right.length) {
                resultArray[indexRes] = right[indexRight++];
            }
            indexRes++;
        }
    }
}
