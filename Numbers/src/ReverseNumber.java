import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to Reverse:");
		int n = sc.nextInt();
		int rev=0,temp;
		while(n != 0){
			temp = n%10;
			rev = rev*10 + temp;
			n = n/10;
		}
		System.out.println("reverse number is"+rev);
		sc.close();
	}

}
