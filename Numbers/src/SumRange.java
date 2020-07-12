import java.util.*;
public class SumRange {

	private static Scanner x;
	
	public static void main(String[] args) {
		x = new Scanner(System.in);
		
		
		System.out.println("Enter range of number to print.. \nStarting Range:");
		Integer a=x.nextInt();
		
		System.out.println("Ending Range: ");
		Integer b=x.nextInt();
		
		int i,sum=0;
		for(i=a;i<=b;i++){
			sum += i;
		}
		System.out.println("Sum of Numbers from "+a+" to "+b+" is: "+sum);
	}

}
