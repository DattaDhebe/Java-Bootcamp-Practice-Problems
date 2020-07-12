import java.util.Scanner;
public class Factorial {
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number for Factrorial:");
		
		int n = sc.nextInt();
		int fact = 1;
		for(int i=1; i<=n; i++){
			fact = fact * i;	
		}
		System.out.println("Factorial of "+n+" :"+fact);
		
		sc.close();
	}
}
