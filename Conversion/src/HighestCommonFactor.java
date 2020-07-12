//import java.util.Arrays;
import java.util.Scanner;

public class HighestCommonFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ENter Two Numbers..args.!\nENter first number:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.print("Enter Second Number:");
		int num2 = sc.nextInt();
		int n=1;
		System.out.print("HCF of "+num1+" and "+num2+" is: ");
		
		while(n != 0)
		{
				//storing remainder
				n = num1 % num2;
				//System.out.print(n);
				if ( n != 0)
				{
					num1 = num2;
					num2 = n;
				}
		}
		System.out.print(num2);
		
		
		
	sc.close();
	}

}
