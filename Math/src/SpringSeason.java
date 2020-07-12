import java.util.Scanner;

//Write a program SpringSeason.java that takes two int values m and d from the
//command line and prints true if day d of month m is between March 20 (m = 3, d
//=20) and June 20 (m = 6, d = 20), false otherwise.

public class SpringSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Month : ");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		System.out.print("Enter Day : ");
		int d = sc.nextInt();
		
		if ( m >= 3 && d >= 20 && d <= 31 && m < 6 )
		{
			System.out.println("True..!");
		}
		else if( m == 6 && d <= 20 )
			System.out.print("True..!");
		else
			System.out.print("False..!");
		
		sc.close();
	}

}
