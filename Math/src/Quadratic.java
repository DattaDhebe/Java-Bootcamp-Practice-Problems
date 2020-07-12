import java.util.Scanner;

//Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
//Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
//can be found using a formula
//delta = b*b - 4*a*c
//Root 1 of x = (-b + sqrt(delta))/(2*a)
//Root 2 of x = (-b - sqrt(delta))/(2*a)
//Take a, b and c as input values to find the roots of x.

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print(" a : ");
		int a = sc.nextInt();
		System.out.print(" b : ");
		int b = sc.nextInt();
		System.out.print(" c : ");
		int c = sc.nextInt();
		
		int delta = 0, x;
		//double x = 0;
		
		delta = b*b - 4*a*c;
		x =(int) (-b + Math.sqrt(delta))/(2*a);
		System.out.print("\nRoot 1 of x : "+x);
		
		x =(int) (-b - Math.sqrt(delta))/(2*a);
		System.out.print("\nRoot 2 of x : "+x);
		
		
		sc.close();
	}

}
