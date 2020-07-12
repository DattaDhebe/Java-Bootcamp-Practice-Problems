import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Number to Chack if it's Armstrong:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = n;
		int temp=0,rem=0;
		
		while(n!=0){
			temp = n%10;
			rem = (temp*temp*temp)+rem;
			n = n/10;
		}
		
		if( k == rem)
			System.out.print(+k+" is an Armstrong number");
		else
			System.out.print(+k+" is Not an Armstrong number");
		
		sc.close();
	}

}
