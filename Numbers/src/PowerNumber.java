import java.util.Scanner;

public class PowerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number and it's power:\nEnter Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("Enter power:");
		int pow = sc.nextInt();
		int res=1;
		for(int i=0; i<pow; i++){
			res = res*num;
		}
		System.out.print(res);
		
		sc.close();
	}

}
