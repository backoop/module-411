package org.example;

import java.util.Arrays;

/**
 * @Autor: Janis Ringli
 * @Date: 8.9.2022
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Sort with my own algorythm" );
        System.out.println("default values");
        int[] values = new int[]{10,4,9,5,1,3,2,8,7,6};
        //System.out.println(Arrays.toString(values));

        Sorter.sortSearchMin(values);
        System.out.println("Selection");
        Sorter.sortSelection(values);
        System.out.println("Insertion");
        Sorter.sortInsertion(values);
        //System.out.println("sorted values");
        //System.out.println(Arrays.toString(values));
    }
}
