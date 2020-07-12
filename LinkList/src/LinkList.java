import java.util.LinkedList;
import java.util.Scanner;

public class LinkList {
	private static Scanner sc;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> l = new LinkedList<Integer>();	
		
		l.add(1);
	
	while(true)
	{
		//switch case for multiple tasks
		System.out.println(" \n1. Add Element from the head.\n2. Add Element from Tail.");
		System.out.println("3. Add Element At Specific Location.");
		System.out.println("4. Remove Element from head.\n5. Remove From Tail.");
		System.out.println("6. Remove From Specific Position.");
		System.out.println("7. Search Element by index and element.");
		System.out.println("8. Sort The link List.");
		System.out.println("9. Remove By Value. ");
		System.out.println("10. Rotate Linked List With Specific Position.");
		System.out.println("\n0. Exit.\n");
		
		printList(l);
		
		System.out.println("\nEnter Your Choice : ");
		sc = new Scanner(System.in);
		int sw = sc.nextInt();
		
		
		switch(sw)
		{
			case 1 :	System.out.print("Enter Element to add Element from Head: ");
						int n = sc.nextInt();
						l.push(n);
						break;
					
			case 2 :	System.out.print("Enter Element to add Element From Tail : ");
						n = sc.nextInt();
						l.add(n);
						break;
						
			case 3 :	System.out.print("Enter index and data to add :\nindex : ");
						int j = sc.nextInt();
						System.out.print("Data : ");
						n = sc.nextInt();
						l.add(j, n);
						break;
					
						
			case 4 : 	l.removeFirst();
						break;
						
			case 5 : 	l.removeLast();
						break;
						
			case 6 : 	System.out.print("Enter index to remove at Specific Position: ");
						j = sc.nextInt();
						l.remove(j);
						break;
						
			case 7 : 	System.out.print("Search by \n1. Index \n2. Element : ");
						n = sc.nextInt();
						if ( n == 1 )
						{
							System.out.print("Enter Index : ");
							j = sc.nextInt();
							System.out.print("\n"+l.get(j));
						}
						else if( n == 2 )
						{
							System.out.print("Enter Element : ");
							int d = sc.nextInt();
							System.out.print("\n"+l.indexOf(d));
						}
						else
							System.out.print("invalid input..!!");
					
						break;
						
			case 8 : 	sortList(l);
						break;
						
			case 9 :	System.out.print("Enter Value to Remove : ");
						n = sc.nextInt();
						j = l.indexOf(n);
						l.remove(j);
						break;
				
			case 10 :	rotateLinkList(l);
						break;
						
			default :	System.out.println("Invalid Choice.. Enter Again.");
						break;
			
		
		}
		if( sw == 0 )
		{
			System.out.println("Your Are Out From Loop...Bye!!");
			break;
		}
	}
	
	}

	public static void printList(LinkedList<Integer> l)
	{

		for(int i=0; i<l.size(); i++)
			System.out.print(l.get(i)+" ");
	}
	
	public static void sortList(LinkedList<Integer> l)
	{
		for(int i=0; i<l.size(); i++)
		{
			for(int j=0; j<l.size(); j++)
			{
				if( l.get(i) < l.get(j) )
				{
					//store element in variable
					int p = l.get(i);
					int k = l.get(j);
					
					//exchange element
					l.set(j, p);
					l.set(i, k);
				
				}
			}
		}
	}
	
	public static void rotateLinkList(LinkedList<Integer> l)
	{
		System.out.print("Enter position : ");
		int k = sc.nextInt();
		//k = k-1;
		int b[] = new int[l.size()];
		int p=0, s=1;
		for(int i=0; i<l.size(); i++)
		{
			for(int j=i; j<l.size(); j++)
			{
				if( l.indexOf(k) == i )
				{	
					//add element to array from k th position
					System.out.print(l.get(j)+" ");
					b[p++] = l.get(j);
				}
				
			}
		}
		System.out.println(" size : "+l.size());
		s = l.size();
		
		
		//add element to link list
		System.out.print("\nArray : ");
		for(int i=p-1; i>=0; i--)
		{
			//System.out.print(b[i]+" ");
			l.push(b[i]);
		}
		
		System.out.println(" size : "+l.size());
		
		//remove additional element index
		for(int i=l.size(); i>s; i--)
		{
			l.removeLast();
			
		}
		

				
		
	}
	

	
}
