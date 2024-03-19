// Name: Billy Motley
// Class: CSC110AB Section 24981
// Date:27 Feb 2024
package labs;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Lab5 {
	
	enum CSCourses {CSC110, CSC205, CSC230, CSC240}
	enum Attack {CAST_FIREBALL, CAST_LIGHTNINGBOLT, SWING_STAFF, KICK}

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		// Problem 1
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int input;
		System.out.println("Enter several numbers: (-1 to quit)");
		input = scnr.nextInt();
		
		while (input != -1) {
			input = scnr.nextInt();
			if (input > max) {
				max = input;
			}
			if ((input < min) && (input != -1)) {
				min = input;
			}
		}
		System.out.println("the largest number is: " + max);
		System.out.println("the smallest number is:" + min);

		
		// Problem 2 Tuition
		System.out.println("Enter a tuition amount: ");
		double amount = scnr.nextDouble();
		System.out.println("Enter how many years you plan to be in college :");
		int years = scnr.nextInt();
		
		double tuition = amount;
		
		for (int ii = 1; ii <= years; ii++) {
			if (ii > 1) {
				tuition += tuition * 0.07;
			}
			System.out.println("The amount of tuition you will pay for year " + ii + " is: " + (tuition));
		}
		
		
		//Problem 3 Temperature table
		
		DecimalFormat fmt = new DecimalFormat("0.##");
		int maxTemp, minTemp = 0;
		
		System.out.println("Enter a minimum temperature (in Fahrenheit)");
		minTemp = scnr.nextInt();
		System.out.println("Enter a maximum temperature (in Fahrenheit)");
		maxTemp = scnr.nextInt();
		
		System.out.println("Degrees F" + "\t" + "Degrees C");
		for (int fahrenheit = minTemp; fahrenheit <= maxTemp; fahrenheit++) {
			double celcius = (fahrenheit - 32) * 5.0 / 9;
			System.out.println(fahrenheit +  " \t " + fmt.format(celcius));
		}
		System.out.println();
		
		//Problem 4 Lottery
		Random rand = new Random();
		int winNumbers = rand.nextInt(899999) + 100000;
		int playNumbers;
		int count = 0;
		
		do {
			playNumbers = rand.nextInt(899999) + 100000;
			count++;
		} 
			while (playNumbers != winNumbers);
		System.out.println("Winning numbers are: " + winNumbers);
		System.out.println("You win! It took " + count + " attempts.");
		
		System.out.println();
		//Problem 5 coinFlip
		System.out.println("Enter how many times you want to flip a coin: ");
		int flips = scnr.nextInt();
		
		int heads = 0; 
		int tails = 0;
		int coin;
		
		for (int count1 = 1; count1 <= flips; count1++) {
			coin = rand.nextInt(2);
			
			if (coin == 1) {
				heads++;
			} 
			else {
				tails++;
			}
		}
		
		System.out.println("Number of Flips: " + flips);
		System.out.println("Heads Landed: " + heads);
		System.out.println("Tails Landed: " + tails);
		
		
		System.out.println();
		//Problem 6 triangle nested loop
		System.out.println("Enter a number 1 - 10: ");
		int base = scnr.nextInt();
		
		for (int row = 1; row <= base; row++) {
			for (int star = 1; star <= row; star++)
				System.out.print("*");
			System.out.println();
		}
		
		
		//Problem 7 shift print
		System.out.println("Enter a word: ");
		String word = scnr.next();
		
		for (int ii = 0; ii < word.length(); ii++ ) {
			char c = word.charAt(ii);
		
			for (int jj = 0; jj < ii; jj++) {
				System.out.print(" ");
			}
			System.out.println(c);
		}
		
		System.out.println();
		//Problem 8 Sumtable
		int sum = 0;
		
		for (int ii = 1; ii <= 10; ii++ ) {
			sum += ii;
			System.out.println(" line " + ii + " = " + sum);
		}
		
		
		System.out.println();
		//Problem 9 triangle 2
		int row = 0;
		int star = 0;
		System.out.println("Enter a number 1 - 10: ");
		int height = scnr.nextInt() - 1;
		
		for (row = 0; row <= height; row++) {
			for (star = 1; star <= row; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (; row >= 0; row--) {
			for(star = 1; star <= row; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		scnr.nextLine();
		
		//Problem 10 only letters
		System.out.println("Enter a string: ");
		String sentence = scnr.nextLine();
		
		for (int rr = 0; rr < sentence.length(); rr++) {
			char c = sentence.charAt(rr);
			if (Character.isLetter(sentence.charAt(rr)))
				System.out.print(c);
			}
	
		
		//Problem 11 only numbers
		System.out.println();
		System.out.println("Enter a string: ");
			String sentence1 = scnr.nextLine();
		
		for (int vv = 0; vv < sentence1.length(); vv++) {
			char n = sentence1.charAt(vv);
			if (Character.isDigit(sentence1.charAt(vv)))
			System.out.print(n);
			}
		
		System.out.println();
		
		
		
		//Problem 13 attack types
		
		Attack attack = Attack.KICK;
		
		switch (attack) {
		case CAST_FIREBALL:
			System.out.println("you cast Fireball!");
			break;
		case CAST_LIGHTNINGBOLT:
			System.out.println("you cast Lightning Bolt!");
			break;
		case SWING_STAFF:
			System.out.println("you swung your staff!");
			break;
		case KICK:
			System.out.println("you kicked with your strong wizard legs!");
			break;
		default:
			System.out.println("You dont know that attack");
		}
		
		
		
	}

}
