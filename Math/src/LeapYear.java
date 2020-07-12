import java.util.Scanner;

//Write a LeapYear.java program that takes a year as input and outputs the Year
//is a Leap Year or not a Leap Year.
//The LeapYear program only works for year >= 1582, corresponding to a year in
//the Gregorian calendar. So ensure to check for the same. Further the Leap Year
//is a Year divisible by 4 and not 100 unless it is divisible by 400. For e.g. 1800 is
//not a Leap Year and 2000 is a Leap Year.

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Year : ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if( year >= 1582 )
		{	
			if( year%4 == 0 && year%100 != 0 || year%400 == 0)
				System.out.print("Leap Year..!!");
			else
				System.out.print("Not a Leap Year..!!");
		}
		else
			System.out.print("Enter year greater than 1582 year.");

		sc.close();
	}

}
