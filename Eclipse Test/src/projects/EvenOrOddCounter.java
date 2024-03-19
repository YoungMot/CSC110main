// Name: Billy Motley
// Class: CSC110AB Section 24981
// Date: 01 March 2024
package projects;

import java.util.Scanner;

public class EvenOrOddCounter {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int value = 0;
		int even = 0;
		int odd = 0;
		int total = 0;
		
		System.out.println("Even or Odd Counter");
		System.out.println("Please enter a series of integer values. (0 to quit)");
		
		do {
			System.out.println("Enter value " + (total + 1) + ":");
			value = scnr.nextInt();
			total++;
			
			if ((value % 2 == 0) && (value != 0)) {
				even++;
			}
			else if (value % 2 == 1) {
				odd++;
			}
			
		} 
			while (value != 0);
		
		if (total == 1) {
			System.out.println("No values were entered");
		}
		else {
		System.out.println("The Results: ");
		System.out.println("Total values entered: " + (total - 1));
		System.out.println("Even values entered: " + even);
		System.out.println("Odd values entered: " + odd);
		}

	}	
	
}
