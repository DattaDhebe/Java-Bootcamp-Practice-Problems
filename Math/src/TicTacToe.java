import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class TicTacToe{
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
		System.out.print("Enter row and column number : ");
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
		
		int win = checkWin(board);
		if (win == 1)
		{
			System.out.println("'X' marked Player Win.");
			break;
		}
		else if(win == 2)
		{
			System.out.println("'O' marked Player Win.");
			break;
		}
		else
			continue;
		
		
	}
	}
	

	public static int checkWin(char[][] board) {
		// TODO Auto-generated method stub
		int c = checkRow(board);
		int r = checkCol(board);
		int d = checkDiagonal(board);
		
		if (r == 1 || r == 2)
			return r;
		else if(c == 1 || c == 2)
			return c;
		else if(d == 1 || d == 2)
			return d;
		return 0;
	}
	
	private static int checkDiagonal(char[][] board) {
		// TODO Auto-generated method stub
		for(int i=0; i<3; i++)
		{
			if( board[0][0] == 'X' && board[1][1]== 'X' && board[2][2] == 'X' )
				return 1;
			else if( board[0][2] == 'X' && board[1][1]== 'X' && board[2][0] == 'X' )
				return 1;
			else if( board[0][2] == 'O' && board[1][1]== 'O' && board[2][0] == 'O' )
				return 2;
			else if( board[0][0] == 'O' && board[1][1]== 'O' && board[2][2] == 'O' )
				return 2;
		}//return false;
		return 0;
	}


	private static int checkCol(char[][] board) {
		// TODO Auto-generated method stub
		for(int i=0; i<3; i++)
			if( board[0][i] == 'X' && board[1][i]== 'X' && board[2][i] == 'X' )
				return 1;
			else if( board[0][i] == 'X' && board[1][i]== 'X' && board[2][i] == 'O' )
				return 2;
		return 0;
	}


	private static int checkRow(char[][] board){
		for(int i=0; i<3; i++)
			if( board[i][0] == 'X' && board[i][1]== 'X' && board[i][2] == 'X' )
				return 1;
			else if( board[i][0] == 'O' && board[i][1]== 'O' && board[i][2] == 'O' )
				return 2;
		return 0;
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