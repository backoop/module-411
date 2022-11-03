package ch.bbw.pr.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * RandomValues
 * 
 * @author Peter Rutschmann
 * @version 26.02.2020
 *
 */
public class RandomValues {

	public ArrayList<Integer> generateIntegerValues(int count
			, int maximum, int minimum, Integer seed){
		ArrayList<Integer> values = new ArrayList<Integer>();
		
		//**********************************
		//Hier den richtigen Code einbauen
		for(int i=0; i<count; i++) {
			values.add(i*2);
		}
		
		return values; 
	}
	
	public ArrayList<Integer> reverseSortOrder(ArrayList<Integer> input){
		ArrayList<Integer> output = new ArrayList<>(input);

		//**********************************
		//Hier den richtigen Code erg�nzen
				
		return output;
	}
	
	public ArrayList<Integer> nearlySorted(ArrayList<Integer> input){
		ArrayList<Integer> output = new ArrayList<>(input);

		//**********************************
		//Hier den richtigen Code erg�nzen

		return output;
	}
}
