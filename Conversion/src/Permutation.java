import java.util.Scanner;
/*
 * Here we will discuss how to find the number of ways N people 
 * can occupy R seats in a classroom in java programming language.
This is a problem specific program which deals with problems
 like in how many ways employees can be arranged in the seats
  available in a company or the same for the students in a school or college.
This problem can be easily solved by the use of the simple formula of permutations which is
nPr =    n! / (n-r)!
Example: we have 5 students and the total number of seats are 6.
Permutations  =    6P5
=    6! / (6-5)!
=    720.
So, there are 720 ways in which 5 students can be arranged in 6 seats.

 */
public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("numbers of People : ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		System.out.print("number of seats : ");
		int n = sc.nextInt();
		int permutation = 0;
		
		permutation = fact(n)/fact(r-n);
		System.out.print("So, there are "+permutation+" ways in which "+n+" students can be arranged in "+r+" seats.");
		sc.close();
	}

	private static int fact(int n) {
		// TODO Auto-generated method stub
		int f = 1;
		for(int i=1; i<=n; i++)
			f = f * i;
		return f;
	}

}
