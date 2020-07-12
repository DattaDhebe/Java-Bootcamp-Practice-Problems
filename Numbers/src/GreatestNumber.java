import java.util.*;
public class GreatestNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		
			
		System.out.println("Enter Numbers to find out greatest number...\nFirst number:");
		Integer a=x.nextInt();
		System.out.println("second Number:");
		Integer b=x.nextInt();
		
		if(a>b){
			System.out.println("number "+a+" is greatest number.");
		}else if(a<b){
			System.out.println("number "+b+" is greatest number.");
		}else{
			System.out.println("Both numbers are Equal.");
		}
		x.close();
	}

}
