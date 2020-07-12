import java.util.Scanner;

/*
 * In this article we will ask the user to enter a positive integer and 
 * check whether that number can be expressed as the sum of two prime numbers.
 *  If that number can be expressed as sum of two prime numbers then print the
 *   numbers in the output and else print the statement that the number cannot
 *    be expressed as a sum of two prime numbers.

 */
public class SumOfPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, cnt = 0;
		int b[] = new int[20];
		int k = 0;
		
		for(int j=1; j<=n; j++){
		for (i=2; i<j; i++)
		{
			if(j%i == 0)
			{
				cnt = 0;
				break;
			}
			else
				cnt = 1;
			
		}
		if(cnt == 1)
			//System.out.print(i+" ");
			b[k++] = i;
		}
		for(i=0; i<k; i++)
			System.out.print(b[i]+" ");
		for(i=0; i<k; i++)
			for(int j=k; j>0; j--)
			{	
				if( i > (k/2))
					break;
				else
					if ((b[i]+b[j]) == n)
						System.out.print("\n"+b[i]+" + "+b[j]+" = "+n);		
			}
			
		
		sc.close();
	}

}
