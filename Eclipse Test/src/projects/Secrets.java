// Name: Billy Motley
// Class: CSC110AB Section 24981
// Date:01 March 2024
package projects;

import java.util.Scanner;

public class Secrets {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		final int PASSWORD_HASH = 883;
		final int SHIFT = 12;
		int asciiValue;
		int sum = 0;
		
		
		System.out.println("Enter a password: ");
		String password = scnr.next();
		
		for (int ii = 0; ii < password.length(); ii++) {
			char c = password.charAt(ii);
			asciiValue = (int) c;
			sum += asciiValue;
		} 
		if (sum != PASSWORD_HASH) {
			System.out.println("Incorrect Password");
		} 
		
		else {
			System.out.println("Correct Password, Enter a sentence: ");
			scnr.nextLine();
			String sentence = scnr.nextLine();
		
		for (int jj = 0; jj < sentence.length(); jj++) {
			char s = sentence.charAt(jj);
			int cypher = Integer.valueOf(s);
			cypher = (s + SHIFT);
			System.out.print(Character.toString(cypher));
		}	
	}

		
	}
	

}
