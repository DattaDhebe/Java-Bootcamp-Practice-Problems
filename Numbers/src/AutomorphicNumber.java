import java.util.Scanner;

/*
 Automorphic number is a number whose square ends in the same digits as the number itself. 

For better understanding lets consider an example :

Suppose a number 5.
Square of 5 is 25.
and we see that 25 ends in the same digit as the number itself, means 5.
Hence we can conclude that 5 is an Automorphic Number.

Some more Automorphic Numbers are : 5 , 6 , 76 , 376 and 890625.
 */

public class AutomorphicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ENter number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sqr = n*n;
		int temp = 0;
		System.out.print(sqr+"\n");
		while( sqr != 0){
			temp = sqr%10;
			//n = n/10;
			
			System.out.print(temp);
			if( temp == n)
			{
				System.out.print(" it is a Automorphic");
				break;
			}
			else
			{
				System.out.print(" it is not Automorphic");
				break;
			}
		
		}
		
		sc.close();
	}

}
