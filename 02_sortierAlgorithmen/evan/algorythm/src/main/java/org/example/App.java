package org.example;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int[] unSortedArray = new int[6];
        for (int i = 0; i < unSortedArray.length; i++) {
            unSortedArray[i] = (int) (Math.random() * 100);
        }

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(unSortedArray);

        int[] unSortedArrayB = new int[6];
        for (int i = 0; i < unSortedArrayB.length; i++) {
            unSortedArrayB[i] = (int) (Math.random() * 100);
        }
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(unSortedArrayB);

        int[] unSortedArrayC = new int[6];
        for (int i = 0; i < unSortedArrayC.length; i++) {
            unSortedArrayC[i] = (int) (Math.random() * 100);
        }
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(unSortedArrayC);
    }
}
