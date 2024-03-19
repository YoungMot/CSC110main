// Name: Billy Motley
// Class: CSC110AB Section 24981
// Date: February 15, 2024

package projects;

import java.text.DecimalFormat;
import java.util.Random;

public class PointDistance {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int x1, y1, x2, y2;
		
		x1 = rand.nextInt();
		y1 = rand.nextInt();
		x2 = rand.nextInt();
		y2 = rand.nextInt();
		
		System.out.println("The X and Y coordinates for 2 random points are: \n("
				+ x1 + ", " + y1 + ") & (" + x2 + ", " + y2 + ")");
		
		double distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		
		DecimalFormat fmt = new DecimalFormat("0.##");
		System.out.println("The distance between the two points is: " + fmt.format(distance));
	}

}
