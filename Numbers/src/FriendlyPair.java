import java.util.Scanner;

/*
Friendly Pair are two natural numbers whose sum of factors of first number
and sum of factors of second number is equal to second number and first 
number respectively.
In other words, Sum of factors of first number is equal to the second 
number and Sum of factors of second number is equal to the first number.
For better understanding let us consider an example.

Example :

Suppose two numbers 220 and 284.
Factors of both numbers :
– Factors of 220 = 1 , 2 , 4 , 5 , 10 , 11 , 20 , 22 , 44 , 55 and 110 ;

– Factors of 284 = 1 , 2 , 4 , 71 and 142.

Sum of factors of both numbers :
– Sum of factors of 220 =

1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284

– Sum of factors of 284 =

1 + 2 + 4 + 71 + 142 = 220

Here we see that Sum of factors of first number is equal to the second number and Sum of factors of second number is equal to the first number. Hence, these both numbers are Friendly Pair to each other.
 */
public class FriendlyPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ENter two numbers to find out Friendly Pair.:\n Enter First Number:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print(" ENter Second number:");
		int b = sc.nextInt();
		int sum1 = 0, sum2 = 0;
		
		for(int i=1; i<a; i++){
			if( a%i == 0){
				sum1 = sum1 + i;
			}
		}
		for(int j=1; j<b; j++){
			if( b%j == 0){
				sum2 = sum2 + j;
			}
		}
		//System.out.print(sum1+"\n ");
		//System.out.print(sum2+"\n ");
		if( a == sum2 && b == sum1)
			System.out.print(+a+" and "+b+" is friendly Pair");
		else
			System.out.print(+a+" and "+b+" is Not a friendly Pair");
		sc.close();
	}

}
