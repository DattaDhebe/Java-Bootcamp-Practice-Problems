import java.util.Scanner;

public class RhombusStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ENter number of Rows : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,j,k;
		
		for(i=0; i<n; i++)
		{	
			
			for(j=0; j<n; j++)
				System.out.print("*");
			System.out.print("\n");
			for(k=0; k<=i; k++)
				System.out.print(" ");
		}
		sc.close();
	}

}
