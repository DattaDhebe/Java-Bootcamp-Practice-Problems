import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Decimal Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b[] = new int[20];
		int j = 0, rem = 0;
		while (n > 0)
		{	
			rem = n % 2;	
			n = n / 2;
			//System.out.print(rem);
			b[j++] = rem;
			
			
		}
		System.out.print("\nBinary number are : ");
		for(int i = j-1; i >= 0; i--)
		{
			System.out.print(b[i]+" ");
		}
		
		
		
		sc.close();
	}

}
