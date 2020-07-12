import java.util.Scanner;

/*
An abundant number is a number for which the sum of its proper factors is greater 
than the number itself. For better understanding lets consider an example so that
 we can easily understand that exactly what is an abundant number.

Abundant number is also known as Excessive number. 

Example :

Suppose an integer value is 24 , then its proper factors are 1, 2, 3, 4, 6, 8, and 12, 
whose sum is 36.
 Because 36 is more than 24, the number 24 is abundant.
  Its abundance is 36 − 24 = 12.
 */
public class AbundantNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		for(int i=1; i<n; i++){
			if ( n%i == 0){
				sum = sum + i;
				//System.out.print(i+"\n");
			}
			
		}
		//System.out.print(sum);
		if ( sum < n)
			System.out.print("\nHence, "+n+" is Not an Abundant Number.");
		else
			System.out.print("\nHence, "+n+" is an Abundunt Number.");
		
		
		sc.close();

	}
}
