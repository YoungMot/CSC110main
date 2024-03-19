// Name: Billy Motley
// Class: CSC110AB Section 24981
// Date: February 06, 2024

package projects;

import java.util.Scanner;

public class TestAverage {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int test1, test2, test3;
		int sum;
		double average;
		
		System.out.print("Test Score 1: ");
		test1 = scnr.nextInt();
		System.out.print("Test Score 2: ");
		test2 = scnr.nextInt();
		System.out.print("Test Score 3: ");
		test3 = scnr.nextInt();
		
		System.out.println("The test scores are: " + test1 + ", " + test2 + ", " + test3 );
		
		sum = test1 + test2 + test3;		//sum of all test scores
		average = sum / 3;					//Calculates the average three test scores
		
		System.out.println("The average of the test scores is: " + average);
		
		scnr.close();
		
		
		

	}

}
