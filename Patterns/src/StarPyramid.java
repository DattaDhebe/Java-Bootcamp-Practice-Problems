import java.util.Scanner;

//import java.util.Scanner;

public class StarPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.print("Enter Number of rows : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i,j,k=0;
		for(i=0; i<=n; i++)
		{
			System.out.print("\n	");
			for(j=i; j<n; j++)
				System.out.print(" ");	
		
			for(k=1; k<=(2*i-1); k++)
				System.out.print("*");
		}
		//return 0;
		sc.close();
	}

}
