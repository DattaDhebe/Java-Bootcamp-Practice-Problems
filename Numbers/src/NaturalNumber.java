import java.util.*;
public class NaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to print nuatural sum:");
		
		Integer n=sc.nextInt();
		int i,sum=0;
		for(i=0;i<=n;i++){
			sum=sum+i;
		}
		System.out.println("answer is:"+sum);
		sc.close();
	}

}
