import java.util.Scanner;

/*
Harshad number is a number or an integer in base 10 which is completely 
divisible by sum of  its digits.

For better understanding let us consider an example.

Example :
Suppose a number 24 .
Calculate the sum of digits of the number (2 + 4) = 6 .
Check whether the number entered by user is completely divisible by sum of its digits or not.
Below are first few Harshad Numbers represented in base 10 :

1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20………

In this article, we will create a java program to check whether the number entered by the user is Harshad number or not.
 */
public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter NUmber:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = n,temp = 0, sum = 0;
		
		while( n != 0){
			temp = n%10;
			sum = sum + temp;
			n = n/10;
		}
		//System.out.print(sum);
		if (k % sum == 0)
			System.out.print(" it is harshad number");
		else
			System.out.print(" it is Not a Harshad Number.");
		

		sc.close();
	}

}
