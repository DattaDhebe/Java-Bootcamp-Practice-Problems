import java.util.Scanner;

public class HollowStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ENter number of Rows : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,j;
		
		for(i=0; i<n; i++)
		{
			System.out.print("\n      ");
			for(j=0; j<n; j++)
				if(j==n-1 || j==0)
					System.out.print("*");
				else if(i==0 || i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");			
			
		}
		
		sc.close();
	}

}
