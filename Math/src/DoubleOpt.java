import java.util.Scanner;

public class DoubleOpt {
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Enter Two Values : ");
		sc = new Scanner(System.in);
		System.out.println(" 1st Value : ");
		double a = sc.nextDouble();
		System.out.println(" 2nd value : ");
		double b = sc.nextDouble();
		
		double result = 0;
		
		result = a + b;
		System.out.println(" Addintion      : "+result);
		
		result = a - b;
		System.out.println(" Subtraction    : "+result);
		
		result = a * b;
		System.out.println(" Multiplication : "+result);
		
		result = a / b;
		System.out.println(" Division       : "+result);
		
	}

}
