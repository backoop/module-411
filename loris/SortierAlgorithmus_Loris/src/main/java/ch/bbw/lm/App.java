package ch.bbw.lm;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import ch.bbw.lm.myAlgorithmus;

/**
 * Eigener Sortieralgorithmus
 * Autor: Loris Müller
 * Datum: 14.09.2022
 */
public class App 
{
    public static void main( String[] args )
    {

        //long startTime = System.nanoTime();

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }

        System.out.println("Unsorted Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println();


        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - MyAlgorithmus");
        System.out.println("2 - Insertionsort");
        System.out.println("3 - Selectionsort");
        System.out.println("4 - Quicksort");
        System.out.println();

        System.out.println("Which algorithmus you will try: ");
        String algorithmus = scanner.nextLine();

        if (Objects.equals(algorithmus, "1")){
            myAlgorithmus.myMethod(arr);
        }
        else if(Objects.equals(algorithmus, "2")){
            myAlgorithmus.insertionSort(arr);
        }
        else if(Objects.equals(algorithmus, "3")){
            myAlgorithmus.selectionSort(arr);
        }




        /*long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);*/
    }
}
