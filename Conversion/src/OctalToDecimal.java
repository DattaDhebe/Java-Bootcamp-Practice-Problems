import java.util.Scanner;

public class OctalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int octal = sc.nextInt();
		int decimal = 0, pow = 0;
		
		while( octal > 0)
		{
			int temp = octal % 10;
			//System.out.print("\n"+temp);
			decimal += temp * Math.pow(8, pow);
			octal /= 10;
			pow++;
		}
		System.out.print("Decimal number : "+decimal);
		
		sc.close();
	}

}
