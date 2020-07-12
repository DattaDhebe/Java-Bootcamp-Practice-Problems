import java.util.*;
public class GreatestOfThree {

	private static Scanner x;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x = new Scanner(System.in);
		
		
		System.out.println("Enter three numbers to find Greatest..\nfirst number:");
		Integer a=x.nextInt();
		System.out.println("Second number:");
		Integer b=x.nextInt();
		System.out.println("Third number:");
		Integer c=x.nextInt();
		
		if(a>b && a>c){
			System.out.println("number "+a+" is greatest.");
		}
		else if(b>a && b>c){
			System.out.println("number "+b+" is greatest.");
		}
		else if(c>a && c>b){
			System.out.println("number "+c+" is greatest.");
		}
		else{
			System.out.println("All Three Numbers are Eqaul.");
		}
		x.close();
	}
	

}
