import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Decimal Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b[] = new int[20];
		int j = 0;
		
		while( n != 0)
		{
			int rem = n % 8;
			n = n / 8;
			b[j++] = rem;
		}
		System.out.print("Octal number are : ");
		for(int i=j-1; i>=0; i--)
		{
			System.out.print(b[i]+" ");
		}
		sc.close();
	}

}
