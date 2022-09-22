package org.example;

import org.apache.commons.lang3.ArrayUtils;

public class BubbleSort {

    public void sort(int[] unSortedArray){
        boolean arraySorted = false;
        int[] sortedArray = unSortedArray;
        int swapcounter;
        while (!arraySorted) {
            swapcounter = 0;
            for (int i = 0; i < unSortedArray.length - 1; i++) {
                int val1 = unSortedArray[i];
                int val2 = unSortedArray[i + 1];
                if (val1 > val2) {
                    sortedArray[i] = val2;
                    sortedArray[i + 1] = val1;
                    swapcounter++;
                } else {
                    sortedArray[i] = val1;
                    sortedArray[i + 1] = val2;
                }
            }
            if (swapcounter == 0) {
                arraySorted = true;
            }


        }
        if(arraySorted == true) {
            System.out.println("BubbleSort Sorted Array:");
            System.out.println(ArrayUtils.toString(sortedArray));
        }
    }

}
