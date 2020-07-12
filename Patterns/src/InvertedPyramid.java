//import java.util.Scanner;

public class InvertedPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.print("ENter number of Rows : ");
//		Scanner sc = new Scanner(System.in);
		int n = 7;// = sc.nextnt();
		int i,j,k;
		int p = n;
		
		for(i=0; i<n; i++)
		{
			System.out.print("\n     ");
			for(k=0; k<i; k++)
				System.out.print(" ");
			for(j=0; j<(2*p-1); j++)
			{
				System.out.print("*");
			}
			for(k=n; k>i; k--)
				System.out.print(" ");
			
			p--;
		}
		
		
	//sc.close();	
	}

}
