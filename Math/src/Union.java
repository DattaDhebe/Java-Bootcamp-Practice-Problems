import java.util.Scanner;

//import java.util.*;

public class Union
{	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Element of 1st Array : ");
		int n = sc.nextInt();
		System.out.println("Enter Element of 1st Array : ");
		int[] a = new int[n];
		
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter Number Of Element of 2nd Array : ");
		n = sc.nextInt();
		System.out.println("Enter Element of 2nd Array : ");
		int[] b = new int[n];
		
		for(int i=0; i<n; i++)
		{
			b[i] = sc.nextInt();
		}
		
	
		int i,j;
		//int[] a = {1,1,1,2,3,4};
		//int[] b = {1,1,2,5,6};
		//int[] c = new int[20];
		
		System.out.print("1st Array : ");
		for(i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		
		System.out.print("\n");
		System.out.print("2nd Array : ");
		for(j=0; j<b.length; j++)
			System.out.print(b[j]+" ");
		
		intersection(a,b);
		union(a,b);
		
		sc.close();
}
	private static void union(int[] a, int[] b)
	{
		System.out.print("\nUnion Result : ");
		  int i = 0;
	      int j = 0;
	      while (i < a.length && j < b.length)
	      {
	            if (a[i] < b[j])
	            {
	                System.out.print(a[i] + " ");
	                i++;
	            } 
	            else if (b[j] < a[i])
	            {
	                System.out.print(b[j] + " ");
	                j++;
	            }
	            else
	            {
	                System.out.print(a[i] + " ");
	                i++;
	                j++;
	            }
	      }
	        while (i < a.length) 
	        {
	            System.out.print(a[i] + " ");
	            i++;
	        }
	        while (j < b.length)
	        {
	            System.out.print(b[j] + " ");
	            j++;
	        }
	    }
	

	private static void intersection(int[] a, int[] b)
	{	int k=0;
		// TODO Auto-generated method stub
		System.out.print("\nIntersection Result : ");
		for(int i=0; i<a.length; i++)
		{
			for(int j=k; j<b.length; j++)
			{	
				
				if( a[i] == b[j] )
				{	
					//c.add(b[j]);
					
					System.out.print(b[j]+" ");
					k++;
					//i++;
					break;
					//cnt = cnt + 1;
					//i--;	
				}//System.out.print("\nj : "+j+" i : "+i);
				
			}
		}

	}
}
