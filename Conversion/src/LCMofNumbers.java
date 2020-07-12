import java.util.Scanner;

public class LCMofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ENter FIsrt No:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.print("ENter SEcond No:");
		int num2 = sc.nextInt();
		int a,i;
		if(num1 > num2)
			a = num1;
		else
			a = num2;
		
		for(i=a; i <= num1*num2; i=i+a)
		{
			if( i%num1 == 0 && i%num2 == 0)
				break;
		}
		System.out.print("\nLCM of Numbers is: "+ i);
		
		
		sc.close();		
		}	
}


