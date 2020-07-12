import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ENter number of Rows : ");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int i,j,k;
		
		for(i=0; i<row; i++)
		{
			System.out.print("\n     ");
			
			for(j=i; j<row; j++)
				System.out.print(" ");
			
			for(k=1; k<=(2*i-1); k++)
				System.out.print(k);
		}
		sc.close();
	}

}
