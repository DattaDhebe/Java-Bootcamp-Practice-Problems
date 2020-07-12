import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to find if its prime or not:");
		Integer n=sc.nextInt();
		PrimeNumber primeNumber = new PrimeNumber();
		boolean status = primeNumber.PrimeChecker(n);
		if(status)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");
		
		sc.close();
	}
	
	public Boolean PrimeChecker(int n)
	{
		int i,count=0;		
		for(i=1; i<=n; i++)
		{
			if( n%i == 0)
			{
				count++;	
			}		
		}
		if(count == 2)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
