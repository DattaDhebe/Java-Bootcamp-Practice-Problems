/*
 Write a program SumOfTwoDice.java that prints the sum of two random integers
between 1 and 6 (such as you might get when rolling dice).
 
 */
//import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class SumOfTwoDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = ThreadLocalRandom.current().nextInt(1,7);
		int b = ThreadLocalRandom.current().nextInt(1,7);

		int res = a + b;
		System.out.println(" a + b : "+a+" + "+b);
		System.out.println("Result Of Random Numbers Of Dice : "+res);
	}

}
