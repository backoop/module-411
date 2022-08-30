package ch.bbw.pr.textverschluesselung;

/**
 * Algorithm
 * Bietet Algorithmen fuer die ersten
 * einfachen Uebungen an.
 * @author Peter Rutschmann
 * @version 26.08.2020
 */
public class Algorithm {
	static public String disguise(String input) {
		//Hier ergänzen Aufgabe 1
		char[] value = input.toCharArray();
		System.out.println(value);
		int half = input.length()/2;

		for (int i=0; i < half; i++){
			char temp = value[i];
			value[i] = value[input.length() - i - 1];
			value[input.length() - i -1] = temp;
		}
		return new String(value);
	}
	
	static public String toUpper(String input) {
		//Hier ergänzen Aufgabe 2
		return input;
	}
	
	static public String toCeasar(String input) {
		//Hier ergänzen Aufgabe 3
		return input;
	}
}
