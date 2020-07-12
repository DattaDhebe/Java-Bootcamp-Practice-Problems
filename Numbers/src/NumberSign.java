import java.util.*;

public class NumberSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter Number to check:");
		
		Integer n=obj.nextInt();
		if(n>0){
			System.out.println("Number is Positive...!");
		}
		else if(n<0){
			System.out.println("number is Negative....!");
		}
		else{
			System.out.println("number is zero...!");
		}
		obj.close();
	}

}
