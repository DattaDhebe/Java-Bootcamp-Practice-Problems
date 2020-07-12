import java.util.Scanner;

//package Numbers.src;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Minimum Value : ");
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int cnt = 0;
		
		
		PrimeNumber pn = new PrimeNumber();
		
		for(int i=min+1; i<=min+100; i++)
		{
			boolean k = pn.PrimeChecker(i);
			if(k)
			{
				System.out.print(i+" ");
				cnt ++;
			}
					
			if(cnt == 2)
				break;
		}
		
		sc.close();
	}

}
