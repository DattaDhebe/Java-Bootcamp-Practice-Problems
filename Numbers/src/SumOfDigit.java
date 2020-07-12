import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to find out its addition:");
		int n = sc.nextInt();
		int temp,sum = 0;
		while(n != 0){
			temp = n%10;
			sum = sum + temp;
			n = n/10;
		}
		System.out.println("result:"+sum);
		
		sc.close();
	}

}
