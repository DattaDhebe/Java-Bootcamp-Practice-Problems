import java.util.Scanner;

public class NumberOfHandshake {
/*
 * Here we will discuss how to find the maximum number of 
 * handshakes which can happen between N number of people given
 *  the fact that any two people shake hands exactly once using
 *   java programming language.
For the number of handshakes to be maximum, every person should 
shakehand with every other person in the room i.e all persons 
present should shake hands. For the first person, there would be 
N-1 people to shake hands. For second person there would N-1 people
 available but as he had already shaken hands with the first person, 
  there would be N-2 people to shake hands and so on.
Therefore the total number of handshake = (N-1 + N-2 +….+ 1 + 0),
which is equivalent to ((N-1)*N)/2.

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ENter Number Of People In a Room : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int handshake = ((n-1)*n) / 2;
		
		System.out.print("Handshakes : "+handshake);
		
		sc.close();
		
	}

}
