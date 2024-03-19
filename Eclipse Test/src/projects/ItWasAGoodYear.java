// Name: Billy Motley
// Class: CSC110AB Section 24981
// Date: 21 Feb 2024
package projects;

import java.util.Scanner;

public class ItWasAGoodYear {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);

		int THISYEAR = 2024;
		int year;
		
		System.out.println("What year would you like to check? ");
		year = scnr.nextInt();
		
		System.out.println("You are checking " + year + ". Is that correct? (yes/no)");
		String answer = scnr.next();
		
		
		// Correct year
		
		if (answer.equals("no"))  {
			System.out.println("What year would you like to check? ");
			year = scnr.nextInt();
			System.out.println("Results for " + year + ":");
		}
		else
			System.out.println("Results for " + year + ":");
		
		// Results
		
		if (year > THISYEAR)  {
			System.out.println("That is " + (year - THISYEAR) + " years from now.");
		}
		else if (year < THISYEAR)  {
			System.out.println("That was " + (THISYEAR - year) + " years ago.");
		}
		
		// Leap year check
		
		if ((year % 100 != 0) && (year % 4 == 0) || (year % 400 == 0))  {
			System.out.println("This is a leap year.");
		}
		else  {
			System.out.println("This is not a leap year. ");
		}
		
		scnr.close();

	}

}
