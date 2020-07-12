
public class HollowPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int i,j,k,p=0;
		
		for(i=0; i<n; i++)
		{
			System.out.print("\n");
			for(j=i; j<n; j++)
				System.out.print(" ");
			p = 2 * i - 1;
			for(k=0; k<p; k++)
			{
				if(k==0 || k==p-1)
					System.out.print("*");
				else if(i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		}

	}

}
