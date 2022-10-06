package org.example;

public class Sorter {
    public static void sortSearchMin(int[] values) {
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
    //Selection sort
    public static void sortSelection(int[] values) {
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
