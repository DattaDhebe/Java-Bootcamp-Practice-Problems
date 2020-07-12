import java.util.Scanner;

public class ArmstrongRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Range to find out Armstrong numbers:\nStaring Number:");
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		
		System.out.print("Ending Number:");
		int end = sc.nextInt();
		
		for(int i=start; i<=end; i++){
			 Armstrong(i);
		}
		sc.close();
		
	}
	private static void Armstrong(int i) {
		// TODO Auto-generated method stub
		int n = i;
		int k=n, temp=0, rem=0;
		while( n != 0){
			temp = n%10;
			rem = (temp*temp*temp)+rem;
			n = n/10;
		}
		if( k == rem)
			System.out.print(k+"\n");
		
	}
}
