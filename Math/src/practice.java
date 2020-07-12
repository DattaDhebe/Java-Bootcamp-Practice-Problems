import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class practice{
	private static Scanner sc;

	public static void main(String[] arg){
		int pr = 0, pc = 0, cr = 0, cc = 0;
		char[][] board = new char[3][3];
		
		//for Player;
		int[] PlayerRow = new int[6];
		int[] PlayerCol = new int[6];
		
		//for Computer;
		int[] CompRow = new int[6];
		int[] CompCol = new int[6];
		
		while(true){
		System.out.print("ENter row and column number betwwen [1 - 3] : ");
		sc = new Scanner(System.in);
		
		//player input
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		//computer input
		int RandomRow = ThreadLocalRandom.current().nextInt(1,4);
		int RandomCol = ThreadLocalRandom.current().nextInt(1,4);
		
		
		
		//store old player input
		PlayerRow[pr++] = row-1;
		PlayerCol[pc++] = col-1;
		
		
		//Store old computer input
		CompRow[cr++] = RandomRow-1;
		CompCol[cc++] = RandomCol-1;
		
		
		PlayerBoard(board, pr, cr, PlayerRow, PlayerCol, CompRow, CompCol);
		printBoard(board);
		
		boolean win = checkWin(board);
		
		if (win)
		{
			System.out.println("'X' marked Player Win.");
			break;
		}
		else
		{
			System.out.println("'O' marked Player Win.");
			break;
		}
		
		
		//sc.close();
	}
	}
	

	public static boolean checkWin(char[][] board) {
		// TODO Auto-generated method stub
		return ( checkRow(board) || checkCol(board) || checkDiagonal(board) );
	}
	
	private static boolean checkDiagonal(char[][] board) {
		// TODO Auto-generated method stub
		for(int i=0; i<3; i++)
			if( checkRow(board[0][0], board[1][1], board[2][2]) == true)
				return true;
		return false;
	}


	private static boolean checkCol(char[][] board) {
		// TODO Auto-generated method stub
		for(int i=0; i<3; i++)
			if( checkRow(board[0][i], board[1][i], board[2][i]) == true)
				return true;
		return false;
	}


	private static boolean checkRow(char[][] board){
		for(int i=0; i<3; i++)
			if( checkRow(board[i][0], board[i][1], board[i][2]) == true)
				return true;
		return false;
	}

	private static boolean checkRow(char c, char d, char e) {
		// TODO Auto-generated method stub
		return ((c != 'X') && (c == d) && (d == e));
	}







	private static void PlayerBoard(char[][] board, int pr, int cr, int[] PlayerRow, int[] PlayerCol, int[] CompRow, int[] CompCol) {
		// TODO Auto-generated method stub
		
		//Player Output
		for(int i=0; i<3; i++)
		{
			//columns
			for(int j=0; j<3; j++)
			{
				for(int k=0; k<pr; k++)
				{
					if( i == PlayerRow[k] && j == PlayerCol[k] )
						board[i][j] = 'X';
				}
				
			}
			
		}
		
		// Computer output
		for(int i=0; i<3; i++)
		{
			//columns
			for(int j=0; j<3; j++)
			{
				
				for(int k=0; k<cr; k++)
				{
					if( i == CompRow[k] && j == CompCol[k] )
						board[i][j] = 'O';
				}
				
			}
			
		}
		
	}

	private static void printBoard(char[][] board) {
		// TODO Auto-generated method stub
		System.out.println("-------------");
		
		for( int i=0; i<3; i++)
		{
			System.out.print("| ");
			for(int j=0; j<3; j++)
			{
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
		
	}

	
}