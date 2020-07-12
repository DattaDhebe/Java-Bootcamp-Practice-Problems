import java.util.Scanner;

/*
 * Addition of two fractions: 
In this article we will create a java program to calculate the sum of two fractions. 
For this purpose we need to ask the user to enter two fractional values where each
 fraction must consist a Numerator and a Denominator.
For understanding this in a better way lets suppose an example :
Suppose, First fraction consist of 1 as numerator and 3 as denominator, and Second
 fraction consist of 3 as numerator and 9 as denominator.
(1 / 3) + (3 / 9) 
1. Find LCM of 3 and 9 and the result will be 9.
2. Multiply 3 in first fraction : (3 / 9) + (3 / 9)
3. Add both fractions and then the result will be : (6 / 9)
4. Now simplify it by finding the HCF of 6 and 9 and the result will be 3.
5. So divide 6 and 9 by 3 and then the result will be : (2 / 3) 
This will be your simplified answer for the given problem.

 */
public class SumOfFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("for 1st Fraction : \n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Numerator : ");
		int num1 = sc.nextInt();
		System.out.print("Enter denominator : ");
		int den1 = sc.nextInt();
		System.out.print("for 2nd fraction : \n" );
		System.out.print("Enter Numerator : ");
		int num2 = sc.nextInt();
		System.out.print("Enter denominator : ");
		int den2 = sc.nextInt();
		int sum_nem = 0, num = 0, den = 0;
		
		//int lcm = find_lcs(den1,den2);
		//num1 = num1 * lcm;
		//num2 = num2 * den1;
		//sum = (num1+num2)/lcm;
		
		num1 = num1 * den2;
		num2  = num2 * den1;
		den1 = den1 * den2;
		den2 = den2 * den1;
		
		sum_nem = num1 + num2;
		
		int hcf = find_hcf(sum_nem, den1);
		System.out.print("hcf is  : "+hcf);
		num = sum_nem / hcf;
		den = den1 / hcf;
		
		
		System.out.print("\nSum Of Fraction is  :");
		System.out.print("\nNumerator  :"+num);
		System.out.print("\nDenominator :"+den);
		
		
		
		sc.close();
	}
	public static int find_hcf(int sum_nem, int den1)
	{	
		int n = 1;
		while( n > 0 )
		{
			n = sum_nem % den1;
			if( n != 0)
			{
				sum_nem  = den1;
				den1 = n;
			}
		}
		return den1;
	}

}
