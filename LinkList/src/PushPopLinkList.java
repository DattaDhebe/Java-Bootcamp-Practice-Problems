import java.util.*;

public class PushPopLinkList {
	private static Scanner sc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l = new LinkedList<Integer>();
		//l.push(1);
		
		while(true)
		{
			
			System.out.println("1. Push()\n2. Pop()\n\n0. Exit.\n");
			printList(l);
			System.out.println("\nEnter Your Choice : ");
			sc = new Scanner(System.in);
			int sw = sc.nextInt();
		
			switch(sw)
			{
				case 1 : System.out.println("Enter Element : ");
						 int n = sc.nextInt();
						 l.push(n);
						 break;
				
				case 2 : l.pop();
						 break;
				
				default : System.out.println("Invalid input..!!"); 
						  break;
						  
			}
			if( sw == 0 )
			{
				System.out.println("You are out of Loop..!!");
				break;
			}
		
		}
	}
	
	private static void printList(LinkedList<Integer> l)
	{
		System.out.print("Link List : ");
		for(int i=0; i<l.size(); i++)
		{
			System.out.print(l.get(i)+" ");
		}
	}

}
