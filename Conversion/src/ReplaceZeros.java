import java.util.Scanner;

public class ReplaceZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ENter NUmber : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b[] = new int[20];
		int j = 0;
		while( n > 0)
		{
			int rem = n % 10;
			if ( rem == 0 )
				b[j++] = 1;
			else
				b[j++] = rem;
			
			n = n / 10;
		}
		System.out.print("Number is : ");
		for(int i=j-1; i>=0; i--)
			System.out.print(b[i]+" ");
		
		sc.close();
	}

}
