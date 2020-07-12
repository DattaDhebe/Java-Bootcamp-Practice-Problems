// create node
class Qnode{
	int data;
	Qnode next;
	
	public Qnode(int d)
	{
		data = d;
		next = null;
	}
	
}


//create front and rear for Queue
class Queue {

	Qnode front, rear;
	
	public Queue()	
	{
		front = rear = null;
	}
	
	
	//method to add data from to the queue
	void enqueue(int d)
	{
		//create new link list
		Qnode temp = new Qnode(d);
		
		//if queue is empty then new node is both front and rear
		if ( rear == null )
		{
			front = rear = temp;
			return;
		}
		
		//add new node at the end of queue and change rear
		rear.next = temp;
		rear = temp;
		
	}
	
	//method to remove data from queue
	void dequeue()
	{
		// check if link list is empty
		if ( front == null )
		{
			return;
		}
		
		// store previous front  and move front one node ahead
		Qnode temp = front;
		front = front.next;
		
		if ( front == null )
		{
			rear = null;
		}
	}
	

}

public class Test{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.enqueue(1); 
        q.enqueue(2);
        q.enqueue(3);
        
        q.dequeue(); 
         
        q.enqueue(4); 
        q.enqueue(5); 
        q.enqueue(6); 
        
        q.dequeue();  
        q.dequeue();
        
        System.out.println("Queue Front : "+q.front.data);
		System.out.println("Queue Rear  : "+q.rear.data);
		
		
	}

}
