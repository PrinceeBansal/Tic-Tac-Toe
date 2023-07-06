package tic_tac_toe;

public class Board {
	
	private char board[][];
	private int boardSize = 3;
	private char p1symbol;
	private char p2symbol;
	private int count;
	final static int Player1wins = 1;
	final static int Player2wins = 2;
	final static int Draw = 3;
	final static int Incomplete = 4;
	final static int Invalid = 5;
	
	public Board(char p1symbol, char p2symbol) {
		this.p1symbol = p1symbol;
		this.p2symbol = p2symbol;
		
		board = new char[boardSize][boardSize];
		
		for(int i = 0; i < boardSize; i++) {
			for(int j =0; j < boardSize; j++) {
				board[i][j] = ' ';
			}
		}
	}
	
	
	public int move(char symbol, int x, int y) {
		if(x<0 || x>boardSize || y<0 || y>boardSize || board[x][y]!=' ') {
			return Invalid;
		}
		
		board[x][y] = symbol;
		count++;
		
		//check row
		if(board[x][0]==board[x][1] && board[x][0]==board[x][2]) {
			return symbol==p1symbol ? Player1wins : Player2wins;
		}
		//check column
		if(board[0][y]==board[1][y] && board[0][y]==board[2][y]) {
			return symbol==p1symbol ? Player1wins : Player2wins;
		}
		//check diagonal 1
		if(board[0][0]!=' ' && board[0][0]==board[1][1] && board[0][0]==board[2][2]) {
			return symbol==p1symbol ? Player1wins : Player2wins;
		}
		
		//check diagonal 2
		if(board[0][2]!=' ' && board[0][2]==board[1][1] && board[0][2]==board[2][0]) {
			return symbol==p1symbol ? Player1wins : Player2wins;
		}
		
		if(count==boardSize*boardSize) {
			return Draw;
		}
		
		return Incomplete;
	}
	
	
	public void print() {
		System.out.println("--------------------");
		for(int i =0; i<boardSize; i++) {
			for(int j =0; j < boardSize; j++) {
				System.out.print("| " + board[i][j] + " |");
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
	}
	
	

}
