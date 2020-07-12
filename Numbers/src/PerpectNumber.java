import java.util.Scanner;

/**
Perfect number is a number whose sum of factors is equal to the given number.
 */

public class PerpectNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Number to Check NUmber:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = 0;
		
		for(int i=1; i<n; i++){
			if( n%i == 0){
				//System.out.print(i+"\n");
				res = res + i;	
			}	
		}
		System.out.print("result is : "+res+" Therefore,\n");
		if( res == n)
			System.out.print("it is Perfect Number");
		else
			System.out.print("it is Not a Perfect Number");
		sc.close();
	}

}
