// Name: Billy Motley
// Class: CSC110AB Section 24981
// Date:
package labs;

import java.util.Random;
import java.util.Scanner;

public class Workspace {
	
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scnr = new Scanner(System.in);
		
		for (int ii = 0; ii < 10; ii++) {
			int roll = (int)(Math.random() * 6) + 1;
			System.out.println(roll);
		}
		
	}

}
