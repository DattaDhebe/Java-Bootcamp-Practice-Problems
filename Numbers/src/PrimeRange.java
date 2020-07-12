import java.util.Scanner;

public class PrimeRange{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Starting Range:");
		int start = sc.nextInt();
		System.out.print("Enter Ending Range:");
		int end = sc.nextInt();
		
		PrimeNumber primeNumberRef = new PrimeNumber(); 
		for(int i=start; i<=end; i++)
		{
		 boolean status =	primeNumberRef.PrimeChecker(i);
		 if(status)
		 {
			 System.out.println(i+ " ");
		 }

		}
		sc.close();
	}
}


