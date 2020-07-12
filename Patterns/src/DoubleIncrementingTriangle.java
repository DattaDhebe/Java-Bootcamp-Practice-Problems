
public class DoubleIncrementingTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int i,j,p=0;
		int k = 3;
		int l = 2;
		
		for(i=1; i<n; i++)
		{
			System.out.print("\n");
			p = k;
			for(j=1; j<=i; j++)
			{	
				System.out.print(k+" ");
				k--;
						
			}
			k = p;
			k = k + l;
			l++;
	   }
		k = p-(n-1);
		p = 2;
		for(i=1; i<n-1; i++)
		{	
			
			System.out.print("\n");
			for(j=0; j<n-p; j++)
			{
				System.out.print(k+" ");
				k--;
				
			}
			p++;
			
		}
		
		
	}

}
