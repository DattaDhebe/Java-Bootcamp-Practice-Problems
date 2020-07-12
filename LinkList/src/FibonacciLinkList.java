import java.util.Scanner;

//create node
class Node{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}//constructor
}


public class FibonacciLinkList {
	static Node head;
	
	//print list method
	public void printList()
	{
		Node n = head;
		
		//check till it reach null that is last node
		while( n != null )
		{
			//print data from list
			System.out.print(n.data+" ");
			n = n.next;
		}
	}
	
	public static void addElement(int[] arr, int p)
	{
		// create node and store head of list in it
		Node n = head;
		Node temp;
		
		//add element all from array to link list
		for(int i=0; i<p; i++)
		{	
			//add element from array to link list
			temp = new Node(arr[i]);
			
			//reach till list is null
			while ( n.next != null )
				n = n.next;
			
			//store new node at last element 		
			n.next = temp;
		}
			
	}
	
	//create fibonacci list and store in array
	public static void fibonacci(int k)
	{
		int a = 1, b = 1, c=0;
		int[] arr = new int[k];
		int p = 0;
		for( int i=0; i<=k; i++)
		{
			c = a + b;
			
			if ( c > k )
				break;
			else
			{
				//add list to array
				arr[p++] = c;
				a = b;
				b = c;
			}

		}
		// send list to array with its size	
		addElement(arr,p);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciLinkList fibo = new FibonacciLinkList();
		
		fibo.head = new Node(0);
		Node second = new Node(1);
		Node third = new Node(1);
		
		//connect first node to second
		fibo.head.next = second;
		//connect second node to third
		second.next = third;
		
		
		//enter range to print fibonacci numbers
		System.out.println("Enter Range Of Fibonacci Sequence : ");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		fibonacci(k);
		
		
		//print link list
		fibo.printList();
		
		
		
		sc.close();
	}

}
