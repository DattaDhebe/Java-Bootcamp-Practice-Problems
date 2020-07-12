import java.util.Scanner;

public class WhichQundrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the Values of 'X' and 'Y' to Find Out Which Quandrant : ");
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if( x < 0 && y < 0)
			System.out.print(x+" and "+y+" lies in '3rd' Quadrant.");
		else if( x > 0 && y > 0)
			System.out.print(x+" and "+y+" lies in '1st' Quadrant.");
		else if( x < 0 && y > 0)
			System.out.print(x+" and "+y+" lies in '2nd' Quadrant.");
		else
			System.out.print(x+" and "+y+" lies in '4th' Quadrant.");
		
		
		sc.close();
		

	}

}
