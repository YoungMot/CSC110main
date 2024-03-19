// Name: Billy Motley
// Class: CSC110AB Section 24981
// Date: 13 March 2024
package projects;

public class Methods {

	public static void banner(String s) {
		System.out.println("========== " + s + " ==========");
	}

	public static double pentagonal(int n) {
		return ((3 * (n * n)) - n) / 2.0;
	}

	public static void repeatPrint(String s, int n) {
		for (int ii = 0; ii < n; ii++) {
			System.out.print(s);
		}
	}

	public static void main(String[] args) {

		banner("Pentagonal Numbers");

		for (int ii = 1; ii <= 10; ii++) {
			System.out.print(pentagonal(ii) + ", ");
		}

		System.out.println();
		for (int ii = 11; ii <= 20; ii++) {
			System.out.print(pentagonal(ii) + ", ");
		}

		System.out.println();
		banner("Repeat Strings");

		repeatPrint("Project", 5);
		System.out.println();

		repeatPrint("CSC110", 10);

	}

}
