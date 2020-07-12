import java.util.Scanner;

/*
 In this article we will create a java program for converting a binary number 
 to its decimal form. For this purpose we need to ask a binary number from user 
 and convert that binary number to its decimal equivalent form and then print 
 the converted number on to the screen.
 
For conversion, we multiply each digit of binary number from
 right with power of 2 and adding each multiplication result. 
 The power starts from 0 and goes to p-1, where p is the total number 
 of digits in binary number. For better understanding with an example 
 just have a look towards the diagram shown at the right.
 */
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter binary number to convert:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = 0, r = 0;
		
		//int l = length(n);
		//System.out.print(l);
		int k = 0;
		
		while (num != 0)
		{
			temp = num % 10;
			r = r  + (temp * eqr(k));
			//System.out.print("\n"+r);
			num = num / 10;
			k ++;
		}
		System.out.print("\nbinary to decimal is "+r);
		sc.close();
	}

	private static int eqr(int k) {
		// TODO Auto-generated method stub
		int p = k, res = 1;
		//System.out.print(k);
		for(int i=0; i<p; i++)
		{
			res = res * 2;
		}
		
		//System.out.print("\n"+res+" ,"+p);
		return res;
	}

}
