// Name: Billy Motley
// Class: CSC110AB Section 24981
// Date: 22 Feb 2024
package projects;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner scnr =  new Scanner(System.in);
		Random rand = new Random();
		
		int select;
		int compSelect;
		
		System.out.println("What is your name? ");
		String name = scnr.nextLine();
		
		System.out.println("Hello, " + name + ". You must choose: ");
		System.out.println("1) Rock ");
		System.out.println("2) Paper ");
		System.out.println("3) Scissors ");
		System.out.println("What is your selection? ");
		select = scnr.nextInt();
		
		compSelect = rand.nextInt(3) + 1;
		
		
		switch (compSelect) {
		case 1:
			System.out.println("Computer chooses Rock");
			if (select == 1)  {
				System.out.println("You chose Rock");
				System.out.println("Tie!");
			}
			else if (select == 2)  {
				System.out.println("You chose Paper");
				System.out.println("Paper covers Rock, You Win!");
			}
			else if (select == 3)  {
				System.out.println("You chose Scissors");
				System.out.println("Rock crushes Scissors, you lose.");
			}
			else  {
				System.out.println("Null - INVALID");
			}
			break;
		
		case 2:
			System.out.println("Computer chooses Paper");
			if (select == 1)  {
				System.out.println("You chose Rock");
				System.out.println("Paper covers Rock, you lose.");
			}
			else if (select == 2)  {
				System.out.println("You chose Paper");
				System.out.println("Tie!");
			}
			else if (select == 3)  {
				System.out.println("You chose Scissors");
				System.out.println("Scissors cut Paper, you Win!.");
			}
			else  {
				System.out.println("Null - INVALID");
			}
			break;
		
		case 3:
			System.out.println("Computer chooses Scissors");
			if (select == 1)  {
				System.out.println("You chose Rock");
				System.out.println("Rock crushes Scissors, you Win!");
			}
			else if (select == 2)  {
				System.out.println("You chose Paper");
				System.out.println("Scissors cut Paper, you lose");
			}
			else if (select == 3)  {
				System.out.println("You chose Scissors");
				System.out.println("Tie!");
			}
			else  {
				System.out.println("Null - INVALID");
			}
			break;
	}
		
		scnr.close();

	}
}
