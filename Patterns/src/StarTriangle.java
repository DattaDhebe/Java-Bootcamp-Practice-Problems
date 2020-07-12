import java.util.Scanner;

public class StarTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ENter number of Rows : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,j;
		for(i=0; i<n; i++)
		{
			System.out.print("\n	");
			for(j=0; j<i; j++)
				System.out.print("*");
			
		}
			
			
	sc.close();
	}

}
