import java.util.*;

public class IntOpt {
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(" a : ");
		sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print(" b : ");
		int b = sc.nextInt();
		System.out.print(" c : ");
		int c = sc.nextInt();
		
		int res = 0;
		
		res = a + b * c;
		System.out.println(" Result for a + b * c : "+res);
		
		res = a * b + c;
		System.out.println(" Result for a * b + c : "+res);
		
		res = a % b + c;
		System.out.println(" Result for a % b + c : "+res);
	}

}
