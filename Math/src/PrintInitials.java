//import java.util.*;

public class PrintInitials {
		//private static Scanner sc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.print("Enter Initial to print : ");
		//sc = new Scanner(System.in);
		char initial = 'k';//sc.next().charAt(0);
		int p = 2, k = 5;
		if ( initial == 'k' )
		{
			for(int i=0; i<5; i++)
			{
				for(int j=0; j>9; j++)
				{
					System.out.print("*");
					
					if ( j == p )
					{
						System.out.print("k");
						p++;
					}
					if( j == k)
					{
						p = 2;	
					}
								
					k--;
					
					System.out.print("*");
				}
				
				System.out.println();
			}
		}
				
	}

}
