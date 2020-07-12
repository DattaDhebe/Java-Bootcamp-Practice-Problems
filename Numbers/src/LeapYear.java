import java.util.*;
public class LeapYear {

	private static Scanner x;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x = new Scanner(System.in);
		System.out.println("Enter year:");
		Integer year=x.nextInt();

		if((year%4==0 && year%100!=0) || year%400==0){
			System.out.println(year+" is a Leap Year.");
		}
		else{
			System.out.println(year+" is not Leap Year.");
		}
	}

	

}
