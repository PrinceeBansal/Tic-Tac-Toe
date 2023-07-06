package tic_tac_toe;

public class TicTacToe {

  Player player1, player2;
	Board board;
	
	public void startGame() {
		//Take player input
		Scanner s = new Scanner(System.in);
		this.player1 = playerInput(1);
		this.player2 = playerInput(2);
		while(player1.getSymbol()==player2.getSymbol()) {
			System.out.println("symbol already taken. Pls choose another symbol");
			char symbol = s.next().charAt(0);
			player2.setSymbol(symbol);
		}
		
		//Create Board
		board = new Board(player1.getSymbol(), player2.getSymbol());
		
		//Conduct Game
		boolean player1turn = true;
		int status = Board.Incomplete;
		while(status==Board.Incomplete || status==Board.Invalid) {    //because if player enters wrong coordinates loop again
			if(player1turn) {
				System.out.println("Player 1 " + player1.getName() + "'s turn");
				System.out.println("Enter x: ");
				int x = s.nextInt();
				System.out.println("Enter y: ");
				int y = s.nextInt();
				
				status = Board.move(player1.getSymbol(), x, y);
				if(status!=Board.Invalid) {
					player1turn = false;
					board.print();
				}
				
			}
			else {
				System.out.println("Player 2 " + player2.getName() + "'s turn");
				System.out.println("Enter x: ");
				int x = s.nextInt();
				System.out.println("Enter y: ");
				int y = s.nextInt();
				
				int status = Board.move(player2.getSymbol(), x, y);
				if(status!=Invalid) {
					player1turn = true;
					board.print();
				}
			}
		}
		
	}
	
	public Player playerInput(int num) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter player " + num + " name:");
		String name = s.nextLine();
		System.out.println("Enter player " + num + " symbol:");
		char symbol = s.next().charAt(0);
		
		Player p = new Player(name,symbol);
		return p;
	}

}
