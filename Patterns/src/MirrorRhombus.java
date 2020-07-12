import java.util.Scanner;

public class MirrorRhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ENter number of Rows : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,j,k,p=n;
		for(k=0; k<n; k++)
		{	System.out.print("\n");
			for(i=p-1; i>=0; i--)
			{
				System.out.print(" ");
			}
			for(j=0; j<n; j++)
			{
				System.out.print("*");
			}
			p--;
		}
		
	sc.close();
	}

}
