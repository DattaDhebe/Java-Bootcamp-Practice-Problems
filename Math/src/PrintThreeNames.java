import java.util.*;

public class PrintThreeNames {
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> names = new LinkedList<String>();
		
		for(int i=1; i<=3; i++)
		{
			System.out.print("Enter "+i+" Number Name : ");
			sc = new Scanner(System.in);
			String str = sc.nextLine();

			names.add(str);
		}
		System.out.print("\nHi");
		for(int i=2; i>=0; i--)
		{
			if( i == 0 )
			{
				System.out.print(" and "+names.get(i)+".");
			}
			else
				System.out.print(" "+names.get(i)+",");
		}

	}

}
