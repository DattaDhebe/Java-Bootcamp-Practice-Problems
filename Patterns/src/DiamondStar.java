
public class DiamondStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int i,j,k;
		int p = n;
		for(i=0; i<n; i++)
		{
			System.out.print("\n");
			for(j=i; j<n; j++)
				System.out.print(" ");
			int q = 2 * i - 1;
			for(k=0; k<q; k++)
				System.out.print("*");
				
		}
		
		for(i=0; i<n; i++)
		{
			System.out.print("\n");
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

	}

}
