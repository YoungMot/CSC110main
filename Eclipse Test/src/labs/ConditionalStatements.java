// Name: Billy Motley
// Class: CSC110AB Section 24981
// Date: 19 February 2024
package labs;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		int income = 67899;
		String result;
		double Owed = 0;
		
		if (income < 90000) {
			result = "22%";
			Owed = (income * 0.22);
		}
		else if (income >= 90000) {
			result = "35%";
			Owed = (income * 0.35);
		}
		else {
			result = "you have no income";
		}
		
		DecimalFormat fmt = new DecimalFormat("0.##");
		
		System.out.println("Your tax rate on $" + income + " is: " + result);
		System.out.println("you will owe: $" + fmt.format(Owed));
		
		Scanner scnr = new Scanner(System.in);
		Random rand = new Random();
		
		int num1, num2, sum;
		
		num1 = rand.nextInt(20) + 1;
		num2 = rand.nextInt(20) + 1;
		sum = (num1 + num2);
		
		System.out.println();
		System.out.println("Find the sum of these two numbers: " + num1 + ", " + num2);
		int guess = scnr.nextInt();
		
		if (sum == guess)  {
			System.out.println("You are correct!");
		}
		else  {
			System.out.println("You are incorrect!");
		}
		
		num1 = rand.nextInt();
		
		System.out.println();
		System.out.println("the number is: " + num1);
		if (num1 % 2 == 0)  {
			System.out.println("An even number is: Heads!");
	}
		else  {
			System.out.println("An odd number is: Tails!");
		}
		
		int num4, num5, num6;
		
		System.out.println();
		System.out.println("Enter three integers: ");
		
		num4 = scnr.nextInt();
		num5 = scnr.nextInt();
		num6 = scnr.nextInt();
		
		if (num4 % num5 == 0) {
			System.out.println("the number " + num5 + " is a factor of " + num4);
		}
		else {
			System.out.println("the number " + num5 + " is not a factor of " + num4);
		}
		if (num4 % num6 == 0) {
			System.out.println("the number " + num6 + " is a factor of " + num4);
		}
		else {
			System.out.println("the number " + num6 + " is not a factor of " + num4);
		}
		
		// switch statements
		
		System.out.println();
		System.out.println("Enter an integer: ");
		int val1 = scnr.nextInt();
		System.out.println("Enter a second integer: ");
		int val2 = scnr.nextInt();
		System.out.println("Enter an operator (+, -, *, /): ");
		String oprt = scnr.next();
		
		switch(oprt)  {
		case "+":
			System.out.println(val1 + " + " + val2 + " = " + (val1 + val2));
			break;
		case "-":
			System.out.println(val1 + " - " + val2 + " = " + (val1 - val2));
			break;
		case "*":
			System.out.println(val1 + " * " + val2 + " = " + (val1 * val2));
			break;
		case "/":
			System.out.println(val1 + " / " + val2 + " = " + (val1 / val2));
			break;
		default:
			System.out.println("Invalid options chosen");
		}
		
		int dayNumber;
		
		System.out.println();
		System.out.println("Enter a day 1 - 12 ");
		dayNumber = scnr.nextInt();
		
		switch(dayNumber)  {
		case 1:
			System.out.println("On the 1st day of Christmas my true love gave to me");
			break;
		case 2:
			System.out.println("On the 2nd day of Christmas my true love gave to me");
			break;
		case 3:
			System.out.println("On the 3rd day of Christmas my true love gave to me");
			break;
		case 4:
			System.out.println("On the 4th day of Christmas my true love gave to me");
			break;
		case 5:
			System.out.println("On the 5th day of Christmas my true love gave to me");
			break;
		case 6:
			System.out.println("On the 6th day of Christmas my true love gave to me");
			break;
		case 7:
			System.out.println("On the 7th day of Christmas my true love gave to me");
			break;
		case 8:
			System.out.println("On the 8th day of Christmas my true love gave to me");
			break;
		case 9:
			System.out.println("On the 9th day of Christmas my true love gave to me");
			break;
		case 10:
			System.out.println("On the 10th day of Christmas my true love gave to me");
			break;
		case 11:
			System.out.println("On the 11th day of Christmas my true love gave to me");
			break;
		case 12:
			System.out.println("On the 12th day of Christmas my true love gave to me");
			break;
		default:
			System.out.println("INVALID");
		}
		
		switch(dayNumber)  {
		case 12:
			System.out.println("Twelve drummers drumming,");
		case 11:
			System.out.println("Eleven pipers piping,");
		case 10:
			System.out.println("Ten lords a-leaping,");
		case 9:
			System.out.println("Nine ladies dancing,");
		case 8:
			System.out.println("Eight maids a-milking,");
		case 7:
			System.out.println("Seven swans a-swimming,");
		case 6:
			System.out.println("Six geese a-laying,");
		case 5:
			System.out.println("Five gold rings,");
		case 4:
			System.out.println("Four calling birds,");
		case 3:
			System.out.println("Three French horns,");
		case 2:
			System.out.println("Two turtle doves, &");
		case 1:
			System.out.println("a partridge in a pear tree.");
			break;
		default:
			System.out.println("INVALID");
		}
		
		
		System.out.println();
		System.out.print("Enter a name: ");
		String name = scnr.next();
		System.out.println("Enter an integer: ");
		int val = scnr.nextInt();
		
		if (name.length() >= val + 1) {
			System.out.println("The character in the string at the value " + val + " is: " + name.charAt(val));
		}
		else {
			System.out.println("Too short.");
		}
		
	scnr.close();
		
	}
	
}
