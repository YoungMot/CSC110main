// Name: Billy Motley
// Class: CSC110AB Section 24981
// Date: 28 Feb 2024
package labs;

public class Loops {

	public static void main(String[] args) {
		
		for (int num = 0; num <= 10; num++) {
			System.out.println("num= " +num);
		}
		
		System.out.println();
		for (int num = 0; num <= 100; num+=5) {
			System.out.println("num= " +num);
		}
		
		System.out.println();
		int total = 0;
		for (int num = 1; num <= 10; num++) {
			total = total + num;
		}
		System.out.println("The total is " + total);

		System.out.println();
		for (int ii=0, jj=100;ii<jj;ii+=7, jj-=13) {
			System.out.println(" ii = " + ii + ", jj = " + jj);
		}
		
		// Printing string
		System.out.println();
		String word = ("repaid");
		for (int ii = 0; ii < word.length(); ii++)
			System.out.print(word.charAt(ii));
		
		// Printing string backwards
		System.out.println();
		word = ("repaid");
		for (int ii = word.length() - 1 ; ii >= 0 ; ii--)
			System.out.print(word.charAt(ii));
		
		// Do - While Loop
		System.out.println();
		System.out.println();
		int ii = 1;
		do {
			System.out.println(ii + " ");
			ii++;
		} 
			while (ii <= 5);
		System.out.println(" ");
		
		
		
		// do - While (Event-Controlled)
		System.out.println();
		int num = 123;
		int sum = 0;
		int oNum = num;  //Original number
		
		do {
			int rd = num % 10;	//rightmost digit
			sum += rd;
			num /= 10;
			
		} while (num > 0);
		System.out.println(oNum + " sum of digits is: " + sum);
		
		
		
		// Nested loops - Loop inside a loop
		System.out.println();
		int outerLoop = 0;
		int innerLoop = 0;
		
		for (outerLoop = 1; outerLoop < 5; outerLoop++) {			//add 1 from outerloop each time
			for (innerLoop = 1; innerLoop <= outerLoop; innerLoop++) {
				System.out.print(innerLoop);
			}
			System.out.println();
		}
		
		for (; outerLoop >= 0; outerLoop--) {					// subtract 1 from outerloop each time
			for( innerLoop = 1; innerLoop <= outerLoop; innerLoop++) {
				System.out.print(innerLoop);
			}
			System.out.println();
		}

		// Looping Through Strings
		String sentence = "Open the pod bay doors, please, HAL";
		int numSpaces = 0;
		
		for (int rr=0; rr<sentence.length(); rr++) {
			char c = sentence.charAt(rr);			// Get character at the index
			System.out.print("[" + c + "]");		// print character with []
			System.out.println("[" + (int) c + "]");	//integer value of character
			if (c == ' ') {								// counts number of spaces
				numSpaces++;
			}
		}
		System.out.println();
		
		System.out.print("The sentence: \"" + sentence + "\" ");
		System.out.println("has " + numSpaces + " spaces");
		
		}
}