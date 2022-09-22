package org.example;


/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args ) {
        Sorter sorter = new Sorter();
//        sorter.ownSorter();
        sorter.quickSort();
        sorter.selectionSort();
        sorter.insertionSort();
    }
}
