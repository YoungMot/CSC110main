// Name: Billy Motley
// Class: CSC110AB Section 24981
// Date:
package labs;

public class StaticMethods {

	public static void welcome(String name) {
		System.out.println("Welcome, " + name + "!");
	}

	public static void multiPrint(String str, int count) {
		for (int ii = 1; ii <= count; ii++) {
			System.out.println(str);
		}
	}

	public static double awardBonus(double pay, int bonus) {
		double amount = (pay * bonus) / 100;
		double total = pay + amount;
		return total;
	}

	public static Boolean isMultiple(int x, int y) {
		if (x % y == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static int lowercaseCount(String str) {
		int count = 0;
		for (int ii = 0; ii < str.length(); ii++) {
			if (Character.isLowerCase(str.charAt(ii))) {
				count++;
			}
		}
		return count;
	}

	// This method tests your isMultiple method
	public static void testIsMultiple(int x, int y) {
		if (isMultiple(x, y)) {
			System.out.println(x + " is a multiple of " + y);
		} else {
			System.out.println(x + " is not multiple of " + y);
		}
	}

	public static void main(String[] args) {
		String name = "Leslie Lamport";
		String title = "Time, Clocks and the Ordering of Events in a Distributed System";

		welcome(name);
		multiPrint("This is a new test.", 3);
		System.out.printf("Pay with bonus: %.2f \n", awardBonus(75000.0, 15));
		testIsMultiple(24, 8);
		testIsMultiple(25, 7);
		System.out.println(name + " has " + lowercaseCount(name) + " lowercase characters ");
		System.out.println(title + "\n    has " + lowercaseCount(title) + " lowercase characters ");

	}

}
