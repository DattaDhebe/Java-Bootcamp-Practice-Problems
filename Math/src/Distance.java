import java.util.Scanner;

/*Write a program Distance.java that takes two integer command-line arguments x
and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
*/

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x : ");
		int x = sc.nextInt();
		System.out.println("Enter y : ");
		int y = sc.nextInt();
		
		int Distance = (int) Math.sqrt( x*x + y*y );
		
		System.out.print("Euclidean Distance : "+Distance);
		
		sc.close();
	}

}
