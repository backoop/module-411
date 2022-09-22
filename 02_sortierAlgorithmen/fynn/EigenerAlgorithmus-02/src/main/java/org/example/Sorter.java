package org.example;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class Sorter {

    public void ownSorter() {
        System.out.println("\n=== Own Sorter ===");
        // Set unsorted Array
        int[] unsortedArray = {8, 6, 9, 7, 10};
        System.out.println(Arrays.toString(unsortedArray));

        // get biggest Number
        int maxNumber = 0;
        for (int number : unsortedArray) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        System.out.println("Höchste Nummer: " + maxNumber);

        // sort Array
        int minNumber = maxNumber;
        int counter = 0;
        int[] sortedArray = new int[unsortedArray.length];
        for (int i = 0; i < unsortedArray.length; i++) {
            for (int number : unsortedArray) {
                if (number < minNumber) {
                    minNumber = number;
                }
            }
            unsortedArray[ArrayUtils.indexOf(unsortedArray, minNumber)] = maxNumber;
            sortedArray[counter] = minNumber;
            counter++;
            minNumber = maxNumber;
            System.out.println(Arrays.toString(sortedArray));
        }
        // Output
        System.out.println("--------------------");
        System.out.println(Arrays.toString(sortedArray));
        System.out.println("Kleinste Nummer: " + minNumber);
    }

    public void quickSort() {
        System.out.println("\n=== Quick Sort ===");
        int[] unsortedArray = {8, 6, 9, 7, 10, 80, 100};
        quickSorter(unsortedArray, 0, unsortedArray.length - 1);
        System.out.printf("Sorted array: %s", Arrays.toString(unsortedArray));
    }
    static int partition(int array[], int low, int high) {
        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return (i + 1);
    }

    static void quickSorter(int array[], int low, int high) {

        if (low < high) {
            int pi = partition(array, low, high);
            quickSorter(array, low, pi - 1);
            quickSorter(array, pi + 1, high);
        }
    }

    public void selectionSort() {
        int[] unsortedArray = {8, 6, 9, 7, 10, 80, 100};
        sortSelection(unsortedArray);
    }

    public void insertionSort() {
        int[] unsortedArray = {8, 6, 9, 7, 10, 80, 100};
        sortInsertion(unsortedArray);
    }

    //Selection sort
    public static void sortSelection(int[] values) {
        System.out.println("\n=== Selection Sort ===");
        int sortedArr[] = new int[values.length];
        int minValue = 99999999;

        for(int i = 0; i < values.length; i++) {
            for(int j = 0; j < values.length; j++) {
                if(values[j] < minValue) {
                    minValue = values[j];
                }
            }
            sortedArr[i] = minValue;
            minValue = 99999999;
        }
        System.out.println("sorted values");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
    //Insertion sort
    public static void sortInsertion(int[] values) {
        System.out.println("\n=== Insertion Sort ===");
        int temp;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - 1; j++) {
                if (values[j] < values[j + 1]) {
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
        System.out.println("sorted values");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}
