import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Strong Number is the number whose sum of factorial of 
		//the digits in any number is equal to the given number. 
		System.out.print("ENter number to find Strong Number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = n;
		int fact, temp=0, res=0;
		
		while( n != 0 ){
			temp = n%10;
			n = n/10;
			
			fact = 1;
			for(int i=1; i<=temp; i++){
				fact = fact * i;
			}
			res = res + fact;
			
		}
		System.out.print("Result is: "+res+" therefore,\n");
		
		if( k == res)
			System.out.print("It is a Strong Number..!");
		else
			System.out.print("It is Not a Strong Number..!");
		
		
		
		sc.close();
	}

}
