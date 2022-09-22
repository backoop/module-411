package org.example;

import org.apache.commons.lang3.ArrayUtils;

public class InsertionSort {
    public void sort(int[] unSortedArray) {
        int[] sortedArray = unSortedArray;
        for (int i = 1; i < sortedArray.length; i++) {
            int key = sortedArray[i];
            int j = i - 1;
            while (j >= 0 && sortedArray[j] > key) {
                sortedArray[j + 1] = sortedArray[j];
                j = j - 1;
            }
            sortedArray[j + 1] = key;
        }
        System.out.println("InsertionSort Sorted Array:");
        System.out.println(ArrayUtils.toString(sortedArray));
    }
}
