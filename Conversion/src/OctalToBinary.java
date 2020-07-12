import java.util.Scanner;

public class OctalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ENter Octal Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = 0, j = 0;
		int b[] = new int[20];
		System.out.print("Binary Number : ");
		while ( n != 0 )
		{
			int rem = n % 10;
			
			while( rem != 0)
			{
				temp = rem % 2;
				rem = rem / 2;
				b[j++] = temp;
					
			}
			n = n / 10;
		}
		
		for(int i=j-1; i>=0; i--)
			System.out.print(b[i]+" ");
	
		sc.close();

	}

}
