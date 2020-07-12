import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1, c=0;
		
		System.out.print("ENter Numeber to find range:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print(a+" ,");
		System.out.print(b);
		
		for(int i=0; i<=n; i++)
		{
				c = a + b;
				
				if(c > n)
					break;
				else{
					System.out.print(" ,");
					System.out.print(c);
					a = b;
					b = c;
				}
		}
		sc.close();
		
	}

}
