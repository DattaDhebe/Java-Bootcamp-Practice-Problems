import java.util.Scanner;

public class BinaryToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number for Conversion :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = 0, p = 0;
		
		while( n > 0 )
		{
			int temp = n % 10;
			d += temp*Math.pow(2, p);
			n = n / 10;
		}
		
			int oct[] = new int[20];
		int i = 0;
		
		while( d > 0)
		{
			int r = d % 8;
			oct[i++] = r;
			d = d / 8;
		}
		System.out.print("octal number is : ");
		for(int j=i-1; j>=0; j--)
		System.out.print(oct[j]);
		
		
		sc.close();
	}

}
