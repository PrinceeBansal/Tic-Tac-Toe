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

  

}
