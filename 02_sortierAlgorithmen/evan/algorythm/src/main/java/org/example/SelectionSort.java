package org.example;

import org.apache.commons.lang3.ArrayUtils;

public class SelectionSort {

    public void sort(int[] unSortedArray) {
        int[] sortedArray = new int[6];
        int min_i;

        for (int i = 0; i < unSortedArray.length; i++) {

            min_i = unSortedArray[i];
            for (int j = 0; j < unSortedArray.length; j++) {

                if (unSortedArray[j] < min_i) {
                    min_i = unSortedArray[j];
                }
            }
            sortedArray[i] = min_i;
            unSortedArray[ArrayUtils.indexOf(unSortedArray, min_i)] = Integer.MAX_VALUE;
        }

        System.out.println("Sorted Array:");
        System.out.println(ArrayUtils.toString(sortedArray));
    }
}
