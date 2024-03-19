//Program Name:
//Author:
//Class:
//Date:
//Description:
package labs;

import java.util.Random;
import java.util.Scanner;

public class ClassesandObjects {

	public static void main(String[] args) {
		
		String lab3 = "Dangerous";
		
		System.out.println("" + lab3 + " has " +lab3.length() + " characters.");
		
		// print third character of string 
		System.out.println("" + lab3.charAt(2));
		System.out.println(""+ lab3.toLowerCase());
		
		
		Random rand = new Random();
		int num1;
		
		num1 = rand.nextInt(12) + 1;
		System.out.println("Random integer between 1 and 12: " + num1);
		
		num1 = rand.nextInt(49) + 100;
		System.out.println("Random integer between 100 and 150: " + num1);
		
		num1 = rand.nextInt(16) - 10;
		System.out.println("Random integer between -10 and 5: " + num1);
		
	
		int val = 42;
		System.out.println("the square root of " + val + " is " + Math.sqrt(val));
		double result1 = Math.sqrt(val);
		
		System.out.println("" + val + " to the 3rd power = " + Math.pow(val, 3));
		double result2 = Math.pow(val, 3);
		
		
		System.out.print("Computer ");
		System.out.println("Science");
		
		String scifi = "Science";
		System.out.println("Computer " + scifi);
		
		Scanner scnr = new Scanner(System.in);
		
		String name;
		System.out.print("Enter a name: ");
		name = scnr.nextLine();
		System.out.println("The length of the name is " +name.length() + " character long.");
		System.out.println("The 2nd and 5th characters in this name is: " + name.charAt(1) + " and " + name.charAt(4));
		String newname = name.replace('a', '@').replace('s', '$');
		System.out.println("Replacing 'a' and 's' with symbols: " + newname);
		
		scnr.close();
		
		int num2, num3;
		
		num2 = rand.nextInt(899) + 100;
		num3 = rand.nextInt(8999) + 1000;
		
		System.out.println("A random phone number can be: " + num2 + "-" + num3);
		
		int x1, y1, x2, y2;
		x1 = 2;
		y1 = 6;
		x2 = 5;
		y2 = 10;
		double D = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		System.out.println("The distance between the two points is: " + D);
		
				
		
		
		
		

	}

}
