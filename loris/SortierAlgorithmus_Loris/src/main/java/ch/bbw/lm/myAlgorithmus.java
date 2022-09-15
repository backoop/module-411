package ch.bbw.lm;

import java.util.Arrays;

public class myAlgorithmus {

    static void myMethod(int[] arr) {
        int sorted = 1;
        while(sorted != 0){

            sorted = 0;
            for(int i=0; i < arr.length - 1; i++){
                int arr1 = arr[i];
                int arr2 = arr[i+1];

                if(arr1 > arr2) {
                    arr[i] = arr2;
                    arr[i + 1] = arr1;
                    sorted++;
                }
            }
            System.out.println(Arrays.toString(arr));
            if(sorted==0){
                System.out.println();
                System.out.println("Sorted Array: ");
                System.out.println(Arrays.toString(arr));
            }

        }
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        System.out.println();
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j-1;
            while ( (i > -1) && ( arr [i] > key ) ) {
                arr [i+1] = arr [i];
                i--;
            }
            arr[i+1] = key;
        }
        System.out.println();
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr){

    }



}
