// Name: Billy Motley
// Class: CSC110AB Section 24981
// Date:
package labs;

import java.util.Scanner;

public class practice {

	public static int cube(int parameter) {
		int result;

		result = parameter * parameter * parameter;
		return result;
	}

	public static double findAverage(int[] a) {
		double result;
		int sum = 0;
		for (int ii = 0; ii < a.length; ii++) {
			sum += a[ii];
		}
		result = (double) sum / a.length;
		return result;
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int cubeOfSeven;
		cubeOfSeven = cube(7);

		System.out.println(cubeOfSeven);
		int cubeOfTen;
		cubeOfTen = cube(10);
		System.out.println(cubeOfTen);

		
		int[] array = { 12, 23, 34, 56 };
		double average = findAverage(array);
		System.out.println("Average: " + average);

		
		
		scnr.close();

	}

}
